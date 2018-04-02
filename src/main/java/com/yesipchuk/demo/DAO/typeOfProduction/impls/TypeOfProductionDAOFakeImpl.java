package com.yesipchuk.demo.DAO.typeOfProduction.impls;

import com.yesipchuk.demo.DAO.typeOfProduction.interfaces.ITypeOfProductionDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.TypeOfProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TypeOfProductionDAOFakeImpl implements ITypeOfProductionDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<TypeOfProduction> getAll() {
        return dataStorage.getTypesOfProduction();
    }
}
