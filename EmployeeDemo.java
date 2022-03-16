
import java.time.LocalDate;

class EmployeeDemo {

  public static void main(String[] args) {

  LocalDate dob = LocalDate.of(2000,03,30);

  Employee emp1 = new Employee(111,"Karan", dob);
  emp1.displayEmployee();

  }

}

class Employee {
   private int empno;
   private String name;
   private LocalDate dateOfBirth;

   Employee(int empno, String name, LocalDate dateOfBirth) {
    this.empno = empno;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }

   void displayEmployee() {
     System.out.println("Empno:"+empno);
     System.out.println("Name:"+name);
     System.out.println("DOB:"+dateOfBirth);
   }

 }