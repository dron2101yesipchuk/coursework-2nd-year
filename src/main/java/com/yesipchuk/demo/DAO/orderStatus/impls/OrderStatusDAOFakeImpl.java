package com.yesipchuk.demo.DAO.orderStatus.impls;

import com.yesipchuk.demo.DAO.orderStatus.interfaces.IOrderStatusDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderStatusDAOFakeImpl implements IOrderStatusDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<OrderStatus> getAll() {
        return dataStorage.getOrderStatuses();
    }
}
