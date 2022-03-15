package week8;

public class CheckingAccount {
    private double balance ;
    private String accountNo;

    public CheckingAccount(String accountNo,double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double deposit(double value) throws Exception {
        if(value>0){
            this.balance +=value;
            return this.balance;
        }else{
            throw new Exception("Value cannot be 0 or a negative number");
        }
    }
    public double withdraw(double value) throws Exception {
        if(value < this.balance){
            this.balance -=value;
            return this.balance;
        }else{
            throw new Exception("Sorry, but your account is short by: $" + (value-this.balance));
//            throw new InsufficientFundsException(value-this.balance);
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public String getNumber(){
        return this.accountNo;
    }
}
