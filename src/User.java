public class User {
    static BankAccount account= new BankAccount(1000);
    synchronized static void Withdraw(BankAccount account, int amount){
        if (amount<=account.getBalance()){
            account.Withdraw(amount);
            System.out.println(" The new balance is " +account.getBalance() );
        }
        else {
            System.out.println("Invalid Transaction!");
        }
    }
}
