package com.yesipchuk.demo.DAO.buyerHasMedicines.impls;

import com.yesipchuk.demo.DAO.buyerHasMedicines.interfaces.IBuyerHasMedicinesDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.BuyersHasMedicines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuyerHasMedicinesDAOFakeImpl implements IBuyerHasMedicinesDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<BuyersHasMedicines> getAll() {
        return null;//dataStorage.getBuyerHasMedicines();
    }
}
