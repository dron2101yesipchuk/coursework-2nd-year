package com.yesipchuk.demo.service.orderStatus.impls;

import com.yesipchuk.demo.DAO.orderStatus.impls.OrderStatusDAOFakeImpl;
import com.yesipchuk.demo.model.OrderStatus;
import com.yesipchuk.demo.service.orderStatus.interfaces.IOrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class OrderStatusService implements IOrderStatusService{

    @Autowired
    OrderStatusDAOFakeImpl orderStatusDAO;

    @Override
    public List<OrderStatus> getAll() throws SQLException {
        return orderStatusDAO.getAll();
    }

    @Override
    public OrderStatus deleteOrderStatus(int id) throws SQLException {
        return orderStatusDAO.deleteOrderStatus(id);
    }
}
