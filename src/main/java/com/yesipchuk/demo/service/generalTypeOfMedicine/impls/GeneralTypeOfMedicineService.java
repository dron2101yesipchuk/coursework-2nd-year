package com.yesipchuk.demo.service.generalTypeOfMedicine.impls;

import com.yesipchuk.demo.DAO.generalTypeOfMedicine.impls.GeneralTypeOfMedicineDAOFakeImpl;
import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import com.yesipchuk.demo.service.generalTypeOfMedicine.interfaces.IGeneralTypeOfMedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class GeneralTypeOfMedicineService implements IGeneralTypeOfMedicinesService{

    @Autowired
    GeneralTypeOfMedicineDAOFakeImpl generalTypeOfMedicineDAO;

    @Override
    public List<GeneralTypeOfMedicine> getAll() throws SQLException {
        return generalTypeOfMedicineDAO.getAll();
    }

    @Override
    public GeneralTypeOfMedicine deleteGeneralType(int id) throws SQLException {
        return generalTypeOfMedicineDAO.deleteGeneralType(id);
    }

    @Override
    public GeneralTypeOfMedicine addGeneralType(GeneralTypeOfMedicine generalTypeOfMedicine) throws SQLException {
        return generalTypeOfMedicineDAO.addGeneralType(generalTypeOfMedicine);
    }

    @Override
    public GeneralTypeOfMedicine updateGeneralType(GeneralTypeOfMedicine generalTypeOfMedicine) throws SQLException {
        return generalTypeOfMedicineDAO.updateGeneralType(generalTypeOfMedicine);
    }
}
