package com.yesipchuk.demo.DAO.typeOfProduction.impls;

import com.yesipchuk.demo.DAO.typeOfProduction.interfaces.ITypeOfProductionDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.TypeOfProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfProductionDAOFakeImpl implements ITypeOfProductionDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfProduction> getAll() throws SQLException {
        List<TypeOfProduction> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_production");
        while(resultSet.next()){
            list.add(new TypeOfProduction((long)resultSet.getInt("id"),
                    resultSet.getString("type_of_production")));
        }
        return list;
    }
}
