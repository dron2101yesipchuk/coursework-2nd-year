package com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.impls;

import com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.interfaces.IDatesOfOrderingAndReceivingDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatesOfOrderingAndReceivingDAOFakeImpl implements IDatesOfOrderingAndReceivingDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<DatesOfOrderingAndReceiving> getAll() {
        return dataStorage.getDatesOfOrderingAndReceiving();
    }
}
