package com.yesipchuk.demo.DAO.buyer.impls;

import com.yesipchuk.demo.DAO.buyer.interfaces.IBuyerDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuyerDAOFakeImpl implements IBuyerDao{
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<Buyer> getAll() {
        return dataStorage.getBuyers();
    }
}
