Implement the following classes:

1.  Bank
-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
-  And five methods, they are (their functions are in their names):
    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. 
        It returns true if the branch was added successfully or false otherwise.
    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), 
        double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
    -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), 
        double (transaction) and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise.
    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
        Return the Branch if it exists or null otherwise.
    -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean. 
        Return true if the branch exists or false otherwise. This method prints out a list of customers.
2.  Branch
    -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
    -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
    -  And five methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getCustomers(), getter for customers.
        -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. 
          Returns true if the customer was added successfully or false otherwise.
        -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean. 
            Returns true if the customers transaction was added successfully or false otherwise.
        -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer. 
            Return the Customer if they exist, null otherwise.
3.  Customer
    -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
    -  A constructor that takes a  String (name of customer) and a double (initial transaction). It initialises name and instantiates transactions.
    -  And three methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getTransactions(), getter for transactions.
        -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.
Bank Class:

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name){
        this.name=name;
        branches=new ArrayList<>(5000);
    }
    public boolean addBranch(String name){
        Branch b=findBranch(name);
        if(b==null){
            branches.add(new Branch(name));
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addCustomer(String bname,String cname,double transaction){
        Branch b=findBranch(bname);
        if(b!=null){
            return b.newCustomer(cname,transaction);
        }
        else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String bname,String cname,double transaction){
        Branch b=findBranch(bname);
        if(b!=null){
            return b.addCustomerTransaction(cname,transaction);
        }
        else{
            return false;
        }
    }
    private Branch findBranch(String name){
        for(Branch b:branches){
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }
    public boolean listCustomers(String bname,boolean pt){
        Branch b=findBranch(bname);
        if(b!=null){
            System.out.println("Customer details for branch " + b.getName());
            for(int i=0;i<b.getCustomers().size();i++){
                Customer c=b.getCustomers().get(i);
                System.out.println("Customer: "+c.getName()+"["+(i+1)+"]");
                if(pt){
                    System.out.println("Transactions");
                    for(int j=0;j<c.getTransactions().size();j++){
                        System.out.println("["+(j+1)+"] Amount "+c.getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}

Branch Class:
  
import java.util.ArrayList;
public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name){
        this.name=name;
        customers=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public boolean newCustomer(String cname,double t){
        Customer c=findCustomer(cname);
        if(c!=null){
            return false;
        }
        else{
            customers.add(new Customer(cname,t));
            return true;
        }
    }
    public boolean addCustomerTransaction(String cname,double t){
        Customer c= findCustomer(cname);
        if(c!=null){
            c.getTransactions().add(t);
            return true;
        }
        else{
            return false;
        }
    }
    private Customer findCustomer(String cname){
        for(Customer c: customers){
            if(c.getName().equals(cname)){
                return c;
            }
        }
        return null;
    }
}

Customer Class:
  
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name,double t){
        this.name=name;
        transactions=new ArrayList<>();
        transactions.add(t);
    }
    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}

Main Class:

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        System.out.println(bank.addBranch("Adelaide"));

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}

Output:
true
Customer details for branch Adelaide
Customer: Tim[1]
Transactions
[1] Amount 50.05
[2] Amount 44.22
[3] Amount 12.44
Customer: Mike[2]
Transactions
[1] Amount 175.34
[2] Amount 1.65
Customer: Percy[3]
Transactions
[1] Amount 220.12

