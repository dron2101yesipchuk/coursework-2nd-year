package com.yesipchuk.demo.service.medicine.impls;

import com.yesipchuk.demo.DAO.medicine.impls.MedicineDAOFakeImpl;
import com.yesipchuk.demo.model.Medicine;
import com.yesipchuk.demo.service.medicine.interfaces.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService implements IMedicineService{

    @Autowired
    MedicineDAOFakeImpl medicineDAO;

    @Override
    public List<Medicine> getAll() {
        return medicineDAO.getAll();
    }
}
