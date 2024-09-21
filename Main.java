public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(1, "Joe Rogan agai");
        account.Deposit(578.0);
        account.Withdraw(234.0);
        account.Withdraw(345.0); 
        account.printTransactionHistory();
        System.out.println("Now you have: " + account.getBalance());
    }
}
