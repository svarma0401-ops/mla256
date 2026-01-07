package com.test;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setDouble(3, emp.getSalary());
            ps.setString(4, emp.getDepartment());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmployee(Employee emp) {
        String sql = "UPDATE employee SET name=?, salary=?, department=? WHERE id=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setDouble(2, emp.getSalary());
            ps.setString(3, emp.getDepartment());
            ps.setInt(4, emp.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try (Connection con = DBUtil.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"),
                        rs.getString("department")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
