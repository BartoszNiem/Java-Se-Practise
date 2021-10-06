package Section_8_exercises;

import java.util.ArrayList;

public class Branch_ex45 {
    private String name;
    private ArrayList<Customer_ex45> customers;
    public Branch_ex45(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer_ex45> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
        Customer_ex45 newCustomer = new Customer_ex45(nameOfCustomer, initialTransaction);
        if(customers.add(newCustomer))
            return true;
        else
            return false;
    }
    private Customer_ex45 findCustomer(String nameOfCustomer){
        Customer_ex45 customeroToReturn = null;
        for (Customer_ex45 customer : customers) {
            if(customer.getName().equals(nameOfCustomer))
                customeroToReturn = customer;
        }
        return customeroToReturn;
    }
    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        if(findCustomer(nameOfCustomer) != null) {
            Customer_ex45 customer = findCustomer(nameOfCustomer);
            customer.addTransaction(transaction);
            return true;
        }
        else
            return false;

    }
}
