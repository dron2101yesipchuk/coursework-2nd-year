package com.yesipchuk.demo.DAO.buyerHasMedicines.impls;

import com.yesipchuk.demo.DAO.buyerHasMedicines.interfaces.IBuyerHasMedicinesDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.BuyerHasMedicines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BuyerHasMedicinesDAOFakeImpl implements IBuyerHasMedicinesDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<BuyerHasMedicines> getAll() throws SQLException {
        List<BuyerHasMedicines> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.buyer_has_medicine");
        while(resultSet.next()){
            list.add(new BuyerHasMedicines((long)resultSet.getInt("buyer_id"),
                    (long)resultSet.getInt("medicine_id"),
                    (long)resultSet.getInt("dates_of_ordering_and_receiving_id"),
                    resultSet.getString("PIB_of_doctor"),
                    resultSet.getString("diagnosis"),
                    (long)resultSet.getInt("amount_of_medicine")));
        }
        return list;
    }
}
