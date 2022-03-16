
  import java.util.Scanner;

class ScannerDemo {

  public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter A/c no");
     int accno = sc.nextInt();
    
     System.out.println("Enter name");
     String name = sc.next();

     System.out.println("Enter balance");
     double balance = sc.nextDouble();

     System.out.println("Account Details");
   
      System.out.println("A/c no: "+accno);
      System.out.println("Name: "+name);
      System.out.println("Balance: "+balance);   
  }


}