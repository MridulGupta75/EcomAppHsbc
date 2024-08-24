package in.co.hsbc.ecommerceApp.dao;

import in.co.hsbc.ecommerceApp.entity.Customer;
import in.co.hsbc.ecommerceApp.entity.Order;

import java.util.List;

public interface CustomerDao {
    Customer getCustomerById(int id);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
    List<Customer> getAllCustomers();
    void placeOrder(Order order);
    void cancelSubscription(int subscriptionId);
}
