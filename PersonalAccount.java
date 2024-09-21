import java.util.List;

public class PersonalAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;
    public List<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        Amount transaction = new Amount(amount, TransactionType.Deposit);
        transactions.add(transaction);
        balance += amount;
    }

    public void Withdraw(double amount){
        if(amount <= balance){
            Amount transaction = new Amount(amount, TransactionType.Withdraw);
            transactions.add(transaction);
            balance -= amount;
        }else{
            System.out.println(">>>");
        }
    }

    public void printTransactionHistory(){
        for(Amount transaction: transactions){
            System.out.println(transaction.getA);
        }
    }
}
