
class Account {

   int accno ;
   String name;
   double balance;

  void deposit(double amount) {    
      balance = balance+amount;
  }

  void withdraw(double amount) {
     balance = balance-amount;
  }

}

class Bank {

  public static void main(String[] args) {

   int i = 10; // i is a primitive variable (local)

    // object or instance creation
    Account account1 = new Account();   // account1 is a reference variable (local)
    
    account1.accno = 101;
    account1.name = "Krish";
    account1.balance = 50000;

    account1.withdraw(5000);

    System.out.println("Current balance:"+account1.balance);   

    Account account2 = new Account();

    account2.accno = 102;
    account2.name = "Raj";
    account2.balance = 65000;

    System.out.println("a/c no:"+account2.accno);  
    System.out.println("name:"+account2.name);  
    System.out.println("balance:"+account2.balance);  
   
  }

}