class ThisDemo {

  public static void main(String[] args) {

      Student st1 = new Student(111,"Krish");
      st1.displayStudent();
    
  }

 }

 class Student {

    private int rollNo;
    private String name;

    Student(int rollNo,String name) {
      this.rollNo = rollNo;
      this.name = name;
   }
  
   void displayStudent() {
       System.out.println("Roll No:"+rollNo);
       System.out.println("Name:"+name);
   }

 }
       
 