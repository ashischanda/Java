package testexception;
// ex: You can not withdraw more money than your balance
// ex: You can not call others if your mobile balance is low than the call rate
public class MyThrow {
    int balance;
    public MyThrow(int x){
        this.balance =x;
    }

    public void withdraw(double amount) throws  InsufficientFundsException
   {
      if(amount <= balance)
      {
         balance -= amount;
      }
      else
      {
         double needs = amount - balance;
         // Look at the spelling.
         // throw vs throws
         throw new InsufficientFundsException(needs);
      }
   }


}

 class InsufficientFundsException extends Exception // It is a subclass of Exception
{
   private double amount;
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   }
   public double getAmount()
   {
      return amount;
   }
}
