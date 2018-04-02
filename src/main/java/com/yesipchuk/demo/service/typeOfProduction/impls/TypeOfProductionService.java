package com.yesipchuk.demo.service.typeOfProduction.impls;

import com.yesipchuk.demo.DAO.typeOfProduction.impls.TypeOfProductionDAOFakeImpl;
import com.yesipchuk.demo.model.TypeOfProduction;
import com.yesipchuk.demo.service.typeOfProduction.interfaces.ITypeOfProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfProductionService implements ITypeOfProductionService{

    @Autowired
    TypeOfProductionDAOFakeImpl typeOfProductionDAO;

    @Override
    public List<TypeOfProduction> getAll() {
        return typeOfProductionDAO.getAll();
    }
}
