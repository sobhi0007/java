public class CheckBalance {
    
    public CheckBalance(Bank account){
       
        System.out.println("Your balance : "+account.balance+" EGP");
        account.services();
    }

}
