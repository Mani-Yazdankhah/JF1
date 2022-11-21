public class Account {
    private int accountNo;
    private String accountType;
    private int accountBalance;

    public void setAccountDetails(int number, String type, int balance) {
        this.accountNo = number;
        this.accountType = type;
        this.accountBalance = balance;
    }

    public void withdraw(int amount) {
        this.accountBalance -= amount;
    }

    public void deposit(int amount) {
        this.accountBalance += amount;
    }

    public void dispAccountDetails() {
        System.out.println("Account number: " + this.accountNo);
        System.out.println("Account type: " + this.accountType);
        System.out.println("Account balance: " + this.accountBalance);
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
}
