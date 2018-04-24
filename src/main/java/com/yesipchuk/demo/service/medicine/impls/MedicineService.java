package com.yesipchuk.demo.service.medicine.impls;

import com.yesipchuk.demo.DAO.medicine.impls.MedicineDAOFakeImpl;
import com.yesipchuk.demo.modelJDBC.Medicine;
import com.yesipchuk.demo.service.medicine.interfaces.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MedicineService implements IMedicineService{

    @Autowired
    MedicineDAOFakeImpl medicineDAO;

    @Override
    public List<Medicine> getAll() throws SQLException {
        return medicineDAO.getAll();
    }
}
