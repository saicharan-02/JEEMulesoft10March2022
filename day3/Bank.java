public class Account {

   private int accno;
   private String name;
   private double balance;

   public void deposit(double amount) {
     balance = balance+amount;
   }

   public void withdraw(double amount) {
     double minBalance = 500;
     double diff = balance - amount;
     if(diff > minBalance) {    
          balance = balance - amount;
     }
     else {
       System.out.println("insufficient fund...");
     }
   }

   public void setAccno(int accno) {
    this.accno = accno;
   }

   public int getAccno() {
      return accno;
   }

   public void setName(String name) {
      this.name = name;
   }
  
   public String getName() {     
      return name;
   }
  
   public void setBalance(int balance) {
      this.balance = balance;
   }
   public double getBalance() {
      return balance;
   }  
      

 }

  class Bank {

    public static void main(String[] args) {

      Account account = new Account();
      account.setAccno(111);
      account.setName("Krish");
      account.setBalance(50000);

      System.out.println("A/c Details:");
      
      int accno= account.getAccno();
      String name = account.getName();
      double bal = account.getBalance();

     System.out.println("A/c no:"+accno);
     System.out.println("Name:"+name);
     System.out.println("Balance:"+bal);     
     
     System.out.println("withdrawing.....");
     account.withdraw(40000);
     
     double updatedBalance = account.getBalance();

     System.out.println("current balance : "+updatedBalance);
     

    }

  }

 





