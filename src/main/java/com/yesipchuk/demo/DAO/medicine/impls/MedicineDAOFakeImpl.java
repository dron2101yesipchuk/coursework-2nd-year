package com.yesipchuk.demo.DAO.medicine.impls;

import com.yesipchuk.demo.DAO.medicine.interfaces.IMedicineDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import com.yesipchuk.demo.model.Medicine;
import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.model.TypeOfProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MedicineDAOFakeImpl implements IMedicineDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<Medicine> getAll() throws SQLException {
        List<Medicine> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.medicine\n" +
                "JOIN type_of_medicine ON type_of_medicine.id = medicine.type_of_medicine_id\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id " +
                "= type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id " +
                "= type_of_medicine.type_of_production_id " +
                "\n order by medicine.id;");
        while(resultSet.next()){
            list.add(new Medicine(resultSet.getInt("medicine.id"),
                    resultSet.getString("medicine.name_of_medicine"),
                    new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                            resultSet.getString("type_of_medicine.name_of_type"),
                            new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                                    resultSet.getString("general_type_of_medicine.name_of_general_type")),
                            new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                                    resultSet.getString("type_of_production.type_of_production"))),
                    resultSet.getInt("medicine.critical_rate"),
                    resultSet.getInt("medicine.amount"),
                    resultSet.getDouble("medicine.price"),
                    resultSet.getDate("medicine.manufacture_date"),
                    resultSet.getInt("medicine.expiration_term")));
        }
        return list;
    }

    @Override
    public Medicine deleteMedicine(int id) throws SQLException {
        List<Medicine> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.medicine\n" +
                "JOIN type_of_medicine ON type_of_medicine.id = medicine.type_of_medicine_id\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id " +
                "= type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id " +
                "= type_of_medicine.type_of_production_id\n" +
                "where medicine.id = " + id + " order by medicine.id");
        while (resultSet.next()){
            list.add(new Medicine(resultSet.getInt("medicine.id"),
                    resultSet.getString("medicine.name_of_medicine"),
                    new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                            resultSet.getString("type_of_medicine.name_of_type"),
                            new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                                    resultSet.getString("general_type_of_medicine.name_of_general_type")),
                            new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                                    resultSet.getString("type_of_production.type_of_production"))),
                    resultSet.getInt("medicine.critical_rate"),
                    resultSet.getInt("medicine.amount"),
                    resultSet.getDouble("medicine.price"),
                    resultSet.getDate("medicine.manufacture_date"),
                    resultSet.getInt("medicine.expiration_term")));
        }
        String sql = "DELETE FROM medicine WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public Medicine addMedicine(Medicine medicine) throws SQLException {
        String sql = "INSERT INTO medicine (id, name_of_medicine, type_of_medicine_id, critical_rate, amount, price, manufacture_date, expiration_term) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, medicine.getId());
        statement.setString(2, medicine.getNameOfMedicine());
        statement.setInt(3, medicine.getTypeOfMedicine().getId());
        statement.setInt(4, medicine.getCriticalRate());
        statement.setInt(5, medicine.getAmount());
        statement.setDouble(6, medicine.getPrice());
        statement.setDate(7, medicine.getManufactureDate());
        statement.setInt(8, medicine.getExpirationTerm());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return medicine;
        else
            return null;
    }

    @Override
    public Medicine updateMedicine(Medicine medicine) throws SQLException {
        String sql  ="UPDATE medicine SET medicine.name_of_medicine = ?, " +
                "medicine.type_of_medicine_id = ?," +
                "medicine.critical_rate = ?," +
                "medicine.amount = ?," +
                "medicine.price = ?," +
                "medicine.manufacture_date = ?," +
                "medicine.expiration_term = ?," +
                " WHERE medicine.id = ?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setString(1,medicine.getNameOfMedicine());
        statement.setInt(2,medicine.getTypeOfMedicine().getId());
        statement.setInt(3, medicine.getCriticalRate());
        statement.setInt(4, medicine.getAmount());
        statement.setDouble(5, medicine.getPrice());
        statement.setDate(6, medicine.getManufactureDate());
        statement.setInt(7, medicine.getExpirationTerm());
        statement.setInt(8, medicine.getId());

        int rowsUpdated  = statement.executeUpdate();
        statement.close();
        if (rowsUpdated >0)
            return medicine;
        else
            return null;
    }
}
