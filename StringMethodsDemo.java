
 class StringMethodsDemo {

   public static void main(String[] args) {

       String str = new String("Rajkumar");

       int len = str.length();
       System.out.println("length:"+len);  

       char ch = str.charAt(4);  

       System.out.println("character at index :"+ch); 

       for(int i=0;i<len;i++) {
            char c = str.charAt(i);  
            System.out.println("character at index "+i+" :"+c); 
       }
    
  }

}