package com.test;

import java.util.List;

public interface OrderDAO {
    void addOrder(OrderMain order) throws Exception;
    void updateOrder(OrderMain order) throws Exception;
    void deleteOrder(int id) throws Exception;
    List<OrderMain> getAllOrders() throws Exception;
}
