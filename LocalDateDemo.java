import java.time.LocalDate;
import java.time.LocalDateTime;

class LocalDateDemo {

  public static void main(String[] args) {

   LocalDate today = LocalDate.now();

   System.out.println(today);

   LocalDateTime  todayTime = LocalDateTime.now();

   System.out.println(todayTime);

   LocalDate dob = LocalDate.of(2000,01,25);

   System.out.println("dob:"+dob);

  }

}