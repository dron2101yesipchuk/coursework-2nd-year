package com.yesipchuk.demo.DAO.buyer.impls;

import com.yesipchuk.demo.DAO.buyer.interfaces.IBuyerDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BuyerDAOFakeImpl implements IBuyerDao{
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<Buyer> getAll() throws SQLException {
        List<Buyer> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM buyer");
        while(resultSet.next()){
            list.add(new Buyer(resultSet.getInt("id"), resultSet.getString("PIB"),
                    resultSet.getInt("age")));
        }

        return list;
    }

    @Override
    public Buyer deleteBuyer(int id) throws SQLException {
        List<Buyer> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM buyer where id="+id);
        while (resultSet.next()){
            list.add(new Buyer(
                    resultSet.getInt("id"),
                    resultSet.getString("pib"),
                    resultSet.getInt("age")
            ));
        }
        String sql = "DELETE FROM buyer WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();
        statement.close();

        return list.get(0);
    }

    @Override
    public Buyer addBuyer(Buyer buyer) throws SQLException {
        String sql = "INSERT INTO buyer (id,PIB,age) VALUES (?,?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, buyer.getId());
        statement.setString(2, buyer.getPIB());
        statement.setInt(3, buyer.getAge());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return buyer;
        else
            return null;
    }

    @Override
    public Buyer updateBuyer(Buyer buyer) throws SQLException {
        String sql  ="UPDATE buyer SET buyer.PIB = ?, buyer.age = ? WHERE buyer.id = ?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setString(1,buyer.getPIB());
        statement.setInt(2,buyer.getAge());
        statement.setInt(3, buyer.getId());

        int rowsUpdated  = statement.executeUpdate();
        statement.close();
        if (rowsUpdated >0)
            return buyer;
        else
            return null;
    }
}
