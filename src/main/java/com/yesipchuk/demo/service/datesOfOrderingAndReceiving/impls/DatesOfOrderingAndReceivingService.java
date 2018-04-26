package com.yesipchuk.demo.service.datesOfOrderingAndReceiving.impls;

import com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.impls.DatesOfOrderingAndReceivingDAOFakeImpl;
import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;
import com.yesipchuk.demo.service.datesOfOrderingAndReceiving.interfaces.IDatesOfOrderingAndReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class DatesOfOrderingAndReceivingService implements IDatesOfOrderingAndReceivingService{

    @Autowired
    DatesOfOrderingAndReceivingDAOFakeImpl datesOfOrderingAndReceivingDAO;

    @Override
    public List<DatesOfOrderingAndReceiving> getAll() throws SQLException {
        return datesOfOrderingAndReceivingDAO.getAll();
    }

    @Override
    public DatesOfOrderingAndReceiving deleteDate(int id) throws SQLException {
        return datesOfOrderingAndReceivingDAO.deleteDate(id);
    }

    @Override
    public DatesOfOrderingAndReceiving addDate(DatesOfOrderingAndReceiving datesOfOrderingAndReceiving) throws SQLException {
        return datesOfOrderingAndReceivingDAO.addDate(datesOfOrderingAndReceiving);
    }

    @Override
    public DatesOfOrderingAndReceiving updateDate(DatesOfOrderingAndReceiving datesOfOrderingAndReceiving) throws SQLException {
        return datesOfOrderingAndReceivingDAO.updateDate(datesOfOrderingAndReceiving);
    }
}
