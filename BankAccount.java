public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailId;
    private double phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double dep){
        accountBalance+=dep;
        System.out.println("Deposit of $"+dep+" is made,New Balance is $"+ accountBalance);
    }
    public void withdraw(double with){
        if(accountBalance-with<0){
            System.out.println("Insufficient Funds, Your only have $"+accountBalance+" in your account");
        }
        else{
            accountBalance-=with;
            System.out.println("Withdrawn of $"+ with+" made,New Balance is "+ accountBalance);
        }
    }
}
