
class StaticDemo {

  public static void main(String[] args) {

    A a1 = new A();

   System.out.println("No of A objects :"+A.counter);

    A a2 = new A();

   System.out.println("No of A objects :"+A.counter);

    A a3 = new A(); 

   System.out.println("No of A objects :"+A.counter);

  }

 }

 class A {

  static int counter;   

   A() {
     counter++;  
   }
  

}