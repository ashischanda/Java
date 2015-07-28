/*
Number of Checking Accounts: 0
Student Account with scholarship
Account Balance: 500.0
--------
Account Balance: 1000.0
--------
********
Rumi 2000.0
Number of Checking Accounts: 0
 */

package teststask;
class Account{
  protected double balance = 0.0;
  public Account(double balance){
        this.balance = balance;
  }
  public double getBalance(){
         return balance;
  }
}


public class TestAccount{
  public static void printBalance(Account a){
     System.out.println("Account Balance: " + a.getBalance());
     System.out.println("--------");
  }
  public static void main(String [] args)
  {
    System.out.println("Number of Checking Accounts: " +        CheckingAccount.numberOfAccount);
     printBalance(new CheckingAccount("Rony"));
     printBalance(new CheckingAccount("Akash", 1000.00));
     System.out.println("********");
     CheckingAccount ob = new CheckingAccount("Rumi", 2000.00);
     System.out.println(ob);

    System.out.println("Number of Checking Accounts: " +    CheckingAccount.numberOfAccount);
  
  }
}
