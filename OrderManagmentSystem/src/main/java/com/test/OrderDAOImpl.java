package com.test;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {

    public void addOrder(OrderMain order) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps =
            con.prepareStatement("INSERT INTO orders(product_name,quantity,price) VALUES (?,?,?)");

        ps.setString(1, order.getProductName());
        ps.setInt(2, order.getQuantity());
        ps.setDouble(3, order.getPrice());
        ps.executeUpdate();
        con.close();
    }

    public void updateOrder(OrderMain order) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps =
            con.prepareStatement("UPDATE orders SET product_name=?, quantity=?, price=? WHERE id=?");

        ps.setString(1, order.getProductName());
        ps.setInt(2, order.getQuantity());
        ps.setDouble(3, order.getPrice());
        ps.setInt(4, order.getId());
        ps.executeUpdate();
        con.close();
    }

    public void deleteOrder(int id) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps =
            con.prepareStatement("DELETE FROM orders WHERE id=?");

        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    public List<OrderMain> getAllOrders() throws Exception {
        List<OrderMain> list = new ArrayList<>();
        Connection con = DBUtil.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM orders");

        while (rs.next()) {
        	OrderMain o = new OrderMain();
            o.setId(rs.getInt("id"));
            o.setProductName(rs.getString("product_name"));
            o.setQuantity(rs.getInt("quantity"));
            o.setPrice(rs.getDouble("price"));
            list.add(o);
        }
        con.close();
        return list;
    }
}
