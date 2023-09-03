import java.util.Scanner;

public class Withdraw {
    public   Withdraw(Bank account){
      
        System.out.println("Please insert withdraw amount , your balance now "+  account.balance + " EGP :" );
        Scanner input = new Scanner(System.in);
        float withdraw_amount = input.nextFloat();
        this.checkBalance(account,withdraw_amount);
        
    }

    public  void checkBalance(Bank account ,Float withdraw_amount){
       
        if(withdraw_amount >  account.balance){
            System.out.println("Insufficient funds !");
            account.serviceRouter(1);
        }else{
              System.out.println("Withdrawal successful !");
              account.balance = account.balance - withdraw_amount;
              System.out.println("Your balance now " + account.balance + "EGP");
              account.services();
        }
       
    }
}