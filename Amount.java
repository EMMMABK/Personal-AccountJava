public class Amount{
    public double amount;
    public TransactionType transactionType;

    public Amount(double amount, TransactionType transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public double getAmount(){
        return amount;
    }

    public TransactionType getTransactionType(){
        return transactionType;
    }
}

