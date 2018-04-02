package com.yesipchuk.demo.DAO.generalTypeOfMedicine.impls;

import com.yesipchuk.demo.DAO.generalTypeOfMedicine.interfaces.IGeneralTypeOfMedicineDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GeneralTypeOfMedicineDAOFakeImpl implements IGeneralTypeOfMedicineDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<GeneralTypeOfMedicine> getAll() {
        return dataStorage.getGeneralTypesOfMedicine();
    }
}
