package com.yesipchuk.demo.service.datesOfOrderingAndReceiving.interfaces;

import com.yesipchuk.demo.modelJDBC.DatesOfOrderingAndReceiving;

import java.sql.SQLException;
import java.util.List;

public interface IDatesOfOrderingAndReceivingService {
    public List<DatesOfOrderingAndReceiving> getAll() throws SQLException;
}
