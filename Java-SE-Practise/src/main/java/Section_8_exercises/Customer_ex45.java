package Section_8_exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer_ex45 {
    private String name;
    private ArrayList<Double> transactions;

    public Customer_ex45(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
