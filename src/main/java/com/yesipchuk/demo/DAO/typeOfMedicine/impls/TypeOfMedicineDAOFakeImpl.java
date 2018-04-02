package com.yesipchuk.demo.DAO.typeOfMedicine.impls;

import com.yesipchuk.demo.DAO.typeOfMedicine.interfaces.ITypeOfMedicinesDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.TypeOfMedicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TypeOfMedicineDAOFakeImpl implements ITypeOfMedicinesDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<TypeOfMedicine> getAll() {
        return dataStorage.getTypesOfMedicine();
    }
}
