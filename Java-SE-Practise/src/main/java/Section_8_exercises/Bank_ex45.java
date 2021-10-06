package Section_8_exercises;

import java.util.ArrayList;

public class Bank_ex45 {
    private String name;
    private ArrayList<Branch_ex45> branches;

    public Bank_ex45(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String nameOfBranch){
        if(branches.add(new Branch_ex45(nameOfBranch)))
            return true;
        else
            return  false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        if(findBranch(branchName) != null){
            Branch_ex45 branch = findBranch(branchName);
            if(branch.newCustomer(customerName, initialTransaction))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    private Branch_ex45 findBranch(String nameOfBranch){
        Branch_ex45 branchToReturn = null;
        for (Branch_ex45 branch :
             branches) {
           if(branch.getName().equals(nameOfBranch)){
               branchToReturn = branch;
           }
        }
        return branchToReturn;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        if(findBranch(branchName) != null){
            Branch_ex45 branch = findBranch(branchName);
            if(branch.addCustomerTransaction(customerName, transaction))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean listCustomers(String branchName, boolean printTransactions){
        if(findBranch(branchName) != null){
            Branch_ex45 branch = findBranch(branchName);
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer_ex45> customers = branch.getCustomers();
            if(printTransactions){
                for (int i=0; i < customers.size(); i++) {
                    System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");
                    ArrayList<Double> transactions = customers.get(i).getTransactions();
                    System.out.println("Transactions:");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println(String.format("[%d] Amount %f", j +1, transactions.get(j)));
                    }
                }
            }
            else{
                for (int i=0; i < customers.size(); i++) {
                    System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");
                }
            }

            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Bank_ex45 bank = new Bank_ex45("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", false);

    }
}
