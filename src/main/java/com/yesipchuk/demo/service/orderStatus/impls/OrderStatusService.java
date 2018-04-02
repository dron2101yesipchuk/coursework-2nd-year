package com.yesipchuk.demo.service.orderStatus.impls;

import com.yesipchuk.demo.DAO.orderStatus.impls.OrderStatusDAOFakeImpl;
import com.yesipchuk.demo.DAO.orderStatus.interfaces.IOrderStatusDao;
import com.yesipchuk.demo.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderStatusService implements IOrderStatusDao{

    @Autowired
    OrderStatusDAOFakeImpl orderStatusDAO;

    @Override
    public List<OrderStatus> getAll() {
        return orderStatusDAO.getAll();
    }
}
