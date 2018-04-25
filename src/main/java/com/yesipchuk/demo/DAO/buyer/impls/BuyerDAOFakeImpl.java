package com.yesipchuk.demo.DAO.buyer.impls;

import com.yesipchuk.demo.DAO.buyer.interfaces.IBuyerDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
