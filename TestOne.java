class TestOne {

  public static void main(String[] args) {

     int a = 10;
     int b = 20;

     sum(10,20); //method calling 
   
     int result =  multi(10,20); //method calling
     System.out.println("Result:"+result);  

  }


  static void sum(int a, int b) {  //method definition
     int c = a+b;
     System.out.println("Sum:"+c);     

   }

  static int multi(int a, int b) {  // method definition     
     int r = a*b;
     return r;
  }

}