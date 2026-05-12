package org.example;

import dto.CustomerDto;
import model.Customer;

import java.sql.SQLException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        int id = 3 ;
        Customer customer = new Customer();
        customer.setFirstName("Ail");
        customer.setEmail("ail705@gmail.com");
        customer.setBalance(556577);
        CustomerDto customerDto = new CustomerDto();

            // delete customer
        try {
            customerDto.deleteCustomer(id);
            System.out.println("Customer deleted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

            //insert customer
        try {
            customerDto.insertCustomer(customer);
            System.out.println("insert customer successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

            // update
        try {
            customerDto.updateCustomer(customer);
            System.out.println("update customer successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            // select customer
        try {
           Customer customer1 = customerDto.selectCustomer(id);
           System.out.println(customer1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

            // select customer
        try {
            List<Customer> customerList = customerDto.selectAllCustomers();
            for (Customer c : customerList) {
                System.out.println(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}