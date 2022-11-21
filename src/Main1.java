public class Main1 {
    public static void main(String[] args) {
        Account acc = new Account();
        int accNo = 12345;
        String accTy = "savings";
        int balance = 10000;
        int deposit = 2000;
        int withdraw = 500;
        acc.setAccountDetails(accNo, accTy, balance);
        acc.deposit(deposit);
        assert acc.getAccountBalance() == balance + deposit;
        acc.withdraw(withdraw);
        assert acc.getAccountBalance() == balance + deposit - withdraw;
        acc.dispAccountDetails();
    }
}
