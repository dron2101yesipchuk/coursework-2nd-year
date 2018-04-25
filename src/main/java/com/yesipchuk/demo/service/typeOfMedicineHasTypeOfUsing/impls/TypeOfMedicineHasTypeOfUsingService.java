package com.yesipchuk.demo.service.typeOfMedicineHasTypeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.impls.TypeOfMedicineHasTypeOfUsingDAOFakeImpl;
import com.yesipchuk.demo.model.TypeOfMedicineHasTypeOfUsing;
import com.yesipchuk.demo.service.typeOfMedicineHasTypeOfUsing.interfaces.ITypeOfMedicineHasTypeOfUsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TypeOfMedicineHasTypeOfUsingService implements ITypeOfMedicineHasTypeOfUsingService{

    @Autowired
    TypeOfMedicineHasTypeOfUsingDAOFakeImpl typeOfMedicineHasTypeOfUsingDAO;

    @Override
    public List<TypeOfMedicineHasTypeOfUsing> getAll() throws SQLException {
        return typeOfMedicineHasTypeOfUsingDAO.getAll();
    }
}
