package com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.interfaces.ITypeOfMedicineHasTypeOfUsingDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.TypeOfMedicineHasTypeOfUsing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TypeOfMedicineHasTypeOfUsingDAOFakeImpl implements ITypeOfMedicineHasTypeOfUsingDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<TypeOfMedicineHasTypeOfUsing> getAll() {
        return dataStorage.getTypeOfMedicineHasTypeOfUsingList();
    }
}
