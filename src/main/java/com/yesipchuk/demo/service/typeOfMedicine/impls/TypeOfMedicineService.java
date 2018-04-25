package com.yesipchuk.demo.service.typeOfMedicine.impls;

import com.yesipchuk.demo.DAO.typeOfMedicine.impls.TypeOfMedicineDAOFakeImpl;
import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.service.typeOfMedicine.interfaces.ITypeOfMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TypeOfMedicineService implements ITypeOfMedicineService{

    @Autowired
    TypeOfMedicineDAOFakeImpl typeOfMedicineDAO;

    @Override
    public List<TypeOfMedicine> getAll() throws SQLException {
        return typeOfMedicineDAO.getAll();
    }

    @Override
    public TypeOfMedicine deleteTypeOfMedicine(int id) throws SQLException {
        return typeOfMedicineDAO.deleteTypeOfMedicine(id);
    }
}
