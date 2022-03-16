class StringBufferDemo {

  public static void main(String[] args) {

    StringBuffer sb1 = new StringBuffer("abc");

    StringBuffer sb2 = new StringBuffer("abc");
   
      if(sb1.equals(sb2)) {

        System.out.println("Both are equal");
      }
      else {

        System.out.println("Both are not equal");
     }

     String st1 = "Hello";

    StringBuffer sb = new StringBuffer(st1);
    sb.reverse();

    System.out.println(sb);
  
  }

}