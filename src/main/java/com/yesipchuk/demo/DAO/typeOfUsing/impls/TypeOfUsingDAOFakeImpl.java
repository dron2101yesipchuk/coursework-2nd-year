package com.yesipchuk.demo.DAO.typeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfUsing.interfaces.ITypeOfUsingDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.TypeOfUsing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfUsingDAOFakeImpl implements ITypeOfUsingDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfUsing> getAll() throws SQLException {
        List<TypeOfUsing> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_using");
        while(resultSet.next()){
            list.add(new TypeOfUsing(resultSet.getInt("type_of_using.id"),
                    resultSet.getString("type_of_using.type_of_using")));
        }
        return list;
    }

    @Override
    public TypeOfUsing deleteTypeOfUsing(int id) throws SQLException {
        List<TypeOfUsing> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_using where id="+id);
        while (resultSet.next()){
            list.add(new TypeOfUsing(resultSet.getInt("type_of_using.id"),
                    resultSet.getString("type_of_using.type_of_using")));
        }
        String sql = "DELETE FROM type_of_using WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public TypeOfUsing addTypeOfUsing(TypeOfUsing typeOfUsing) throws SQLException {
        String sql = "INSERT INTO type_of_using (id, type_of_using) VALUES (?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, typeOfUsing.getId());
        statement.setString(2, typeOfUsing.getNameOfType());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return typeOfUsing;
        else
            return null;
    }

    @Override
    public TypeOfUsing updateTypeOfUsing(TypeOfUsing typeOfUsing) throws SQLException {
        return null;
    }
}
