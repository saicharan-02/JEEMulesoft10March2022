
  public class SuperDemoOne {

   public static void main(String[] args) {
      
      B b1 = new B(10);

    }

  }

  class A {

   A() {
      System.out.println("A class zero arg constructor...");
   }

    A(int j) {
       System.out.println("A class int arg constructor...");
    }   
  }

 class B extends A {

   B(int k) {
    super(30);
    System.out.println("B class int arg constructor...");

   }

 }