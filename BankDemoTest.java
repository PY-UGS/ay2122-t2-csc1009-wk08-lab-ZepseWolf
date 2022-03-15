package week8;

import java.util.Scanner;

public class BankDemoTest extends Exception {
    public static void main(String[] args) throws Exception {
        CheckingAccount acc = new CheckingAccount("312-4221-42" ,0);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Deposit amount : $ " );
        double value = sc.nextDouble();
        try{
            System.out.println("Deposited : $ " +acc.deposit(value));
            System.out.print("Enter Withdraw  amount : $ " );
            value = sc.nextDouble();
            System.out.println("Money left in account : $ " +acc.withdraw(value));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
