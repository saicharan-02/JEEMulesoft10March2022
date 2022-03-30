
class Account1 {

  private int accno ;
  private String name;
  private double balance;

  void setAccount(int acno, String acname,double acbal) {
     accno = acno;
     name = acname;
     balance = acbal;
  }

  void deposit(double amount) {    
      balance = balance+amount;
  }

  void withdraw(double amount) {
     balance = balance-amount;
  }

  void displayAccount() {
    System.out.println("a/c no:"+accno);  
    System.out.println("name:"+name);  
    System.out.println("balance:"+balance); 
  }    

}

class Bank1 {

  public static void main(String[] args) { 
 
    Account1 account1 = new Account1();   
    account1.setAccount(101,"Krish",50000);
    account1.withdraw(5000);
    account1.displayAccount();
   

    Account1 account2 = new Account1();
    account2.setAccount(102,"Raj",65000);
    account2.displayAccount(); 

   
  }

}