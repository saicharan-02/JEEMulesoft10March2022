class ThisDemo2 {

  public static void main(String[] args) {

    Sample s1 = new Sample();


  }

 }


class Sample {

   Sample() {     
    this(20);
    System.out.println("zero args constructor..");
   
   }

    Sample(int k) {    
     System.out.println("int args constructor.."+k);
  } 

 }
