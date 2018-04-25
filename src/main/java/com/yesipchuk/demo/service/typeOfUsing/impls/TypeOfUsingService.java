package com.yesipchuk.demo.service.typeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfUsing.impls.TypeOfUsingDAOFakeImpl;
import com.yesipchuk.demo.model.TypeOfUsing;
import com.yesipchuk.demo.service.typeOfUsing.interfaces.ITypeOfUsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TypeOfUsingService implements ITypeOfUsingService{

    @Autowired
    TypeOfUsingDAOFakeImpl typeOfUsingDAO;

    @Override
    public List<TypeOfUsing> getAll() throws SQLException {
        return typeOfUsingDAO.getAll();
    }
}
