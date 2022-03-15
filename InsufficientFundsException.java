package week8;

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) throws Exception {
        if(amount < 0){
            throw new Exception("Sorry, but your account is short by: $" + amount);
        }else{
            this.amount = amount;
        }

    }
    public double getAmount() {
        return amount;
    }
}