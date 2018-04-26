package com.yesipchuk.demo.service.medicineHasIngredients.impls;

import com.yesipchuk.demo.DAO.medicineHasIngredients.impls.MedicineHasIngredientsDAOFakeImpl;
import com.yesipchuk.demo.model.MedicineHasIngredients;
import com.yesipchuk.demo.service.medicineHasIngredients.interfaces.IMedicineHasIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MedicineHasIngredientsService implements IMedicineHasIngredientsService{

    @Autowired
    MedicineHasIngredientsDAOFakeImpl medicineHasIngredientsDAO;

    @Override
    public List<MedicineHasIngredients> getAll() throws SQLException {
        return medicineHasIngredientsDAO.getAll();
    }

    @Override
    public MedicineHasIngredients deleteMedicineHasIngredients(int id) throws SQLException {
        return medicineHasIngredientsDAO.deleteMedicineHasIngredients(id);
    }

    @Override
    public MedicineHasIngredients addMedicineHasIngredients(MedicineHasIngredients medicineHasIngredients) throws SQLException {
        return medicineHasIngredientsDAO.addMedicineHasIngredients(medicineHasIngredients);
    }

    @Override
    public MedicineHasIngredients updateMedicineHasIngredients(MedicineHasIngredients medicineHasIngredients) throws SQLException {
        return medicineHasIngredientsDAO.updateMedicineHasIngredients(medicineHasIngredients);
    }
}
