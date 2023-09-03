import java.util.Scanner;

public class Deposit {
    
    public   Deposit(Bank account){
      
        System.out.println("Please insert your deposit amount , your balance now  :" +account.balance + " EGP"  );
        Scanner input = new Scanner(System.in);
        float deposit_amount = input.nextFloat();
        this.checkBalance(account,deposit_amount);
        
    }

    public  void checkBalance(Bank account ,Float deposit_amount){
       
        if(deposit_amount <= 0){
            System.out.println("Amount must be more than 0  ");
            account.serviceRouter(1);
        }else{
              System.out.println("Deposit inserted successful !");
              account.balance = account.balance +deposit_amount;
              System.out.println("Your balance now " + account.balance + "EGP");
              account.services();
        }
       
    }
}
