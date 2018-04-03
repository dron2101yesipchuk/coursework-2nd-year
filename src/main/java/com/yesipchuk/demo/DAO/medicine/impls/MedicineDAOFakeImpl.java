package com.yesipchuk.demo.DAO.medicine.impls;

import com.yesipchuk.demo.DAO.medicine.interfaces.IMedicineDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicineDAOFakeImpl implements IMedicineDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<Medicine> getAll() {
        return dataStorage.getMedicines();
    }
}
