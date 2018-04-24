package com.yesipchuk.demo.DAO.typeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfUsing.interfaces.ITypeOfUsingDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.TypeOfUsing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfUsingDAOFakeImpl implements ITypeOfUsingDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfUsing> getAll() throws SQLException {
        List<TypeOfUsing> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_using");
        while(resultSet.next()){
            list.add(new TypeOfUsing((long)resultSet.getInt("id"),
                    resultSet.getString("type_of_using")));
        }
        return list;
    }
}
