package com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.interfaces.ITypeOfMedicineHasTypeOfUsingDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.TypeOfMedicineHasTypeOfUsing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfMedicineHasTypeOfUsingDAOFakeImpl implements ITypeOfMedicineHasTypeOfUsingDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfMedicineHasTypeOfUsing> getAll() throws SQLException {
        List<TypeOfMedicineHasTypeOfUsing> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_medicine_has_type_of_using");
        while(resultSet.next()){
            list.add(new TypeOfMedicineHasTypeOfUsing((long)resultSet.getInt("type_of_medicine_id"),
                    (long)resultSet.getInt("type_of_using_id")));
        }
        return list;
    }
}
