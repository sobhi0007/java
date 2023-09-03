import java.util.Scanner;

public class Bank {
    String name;
    float balance = 1000f;
    String services[] =  {"Withdraw request", "Deposit request" , "Check your balance"};
    public void start(){
        System.out.println("Hello !");
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your name : ");
        String name = input.nextLine();
        Greeting(name);

        System.out.println("Please choose a number which service do you require .");
        services();
       
    }
    
    public void Greeting(String n){
        name = n;
        System.out.println("Good morning " + name + " !");
    }

    public void services(){
        int count = 1;
        for (String service : services) {
            System.out.println(count++ + ". " + service);
        }
        System.out.print(">> ");
        Scanner input = new Scanner(System.in);
        int service = input.nextInt();
       
        serviceRouter(service);
    }

    public void serviceRouter(int service){
            if(service <= 0 || service > services.length){
                System.out.println("Service not found please try again !");
                services();
            }else{
              Bank account = new Bank();
              switch (service-1) {
                case 0:
                 
                   Withdraw withdraw = new Withdraw(account);
                break;
                case 1:
                     Deposit deposit = new Deposit(account);
                break;
                case 2:
                      CheckBalance checkBalance = new CheckBalance(account);
                break;
               
              }
            }
    }
}
