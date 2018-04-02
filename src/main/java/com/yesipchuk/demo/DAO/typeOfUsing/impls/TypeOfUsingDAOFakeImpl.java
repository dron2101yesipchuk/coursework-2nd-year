package com.yesipchuk.demo.DAO.typeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfUsing.interfaces.ITypeOfUsingDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.TypeOfUsing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TypeOfUsingDAOFakeImpl implements ITypeOfUsingDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<TypeOfUsing> getAll() {
        return dataStorage.getTypesOfUsing();
    }
}
