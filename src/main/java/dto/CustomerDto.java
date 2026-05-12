package dto;

import connection.DBConnection;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomerDto {

    public void insertCustomer(Customer customer) throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "INSERT INTO customers(name, email, balance) VALUES(?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, customer.getFirstName());
        pst.setString(2, customer.getEmail());
        pst.setDouble(3, customer.getBalance());
        pst.execute();
        pst.close();
        con.close();

    }


    public  void updateCustomer(Customer customer) throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "update customers set name=?, email=?, balance=? where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, customer.getFirstName());
        pst.setString(2, customer.getEmail());
        pst.setDouble(3, customer.getBalance());
        pst.setInt(4, customer.getId());
        pst.execute();
        pst.close();
        con.close();
    }

    public void deleteCustomer(int id) throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "delete from customers where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.execute();
        pst.close();
        con.close();
    }

    public Customer selectCustomer(int id) throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "select * from customers where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Customer customer = new Customer();
            customer.setId(rs.getInt("id"));
            customer.setFirstName(rs.getString("name"));
            customer.setEmail(rs.getString("email"));
            customer.setBalance(rs.getDouble("balance"));
            return customer;
        }
        return null;
    }
     public List<Customer> selectAllCustomers() throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "select * from customers";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        List<Customer> customers = new ArrayList<>();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setId(rs.getInt("id"));
            customer.setFirstName(rs.getString("name"));
            customer.setEmail(rs.getString("email"));
            customer.setBalance(rs.getDouble("balance"));
            customers.add(customer);
        }
        return customers;
     }
}
