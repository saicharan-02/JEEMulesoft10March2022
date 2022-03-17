
  public class InhertianceDemo{

    public static void main(String[] args) {
   
     SmartPhone smartPhone = new SmartPhone();

     smartPhone.makeCall();
     smartPhone.receiveCall();
     smartPhone.sendTextMsg();
     smartPhone.receiveTextMsg();

     smartPhone.takePic();
     smartPhone.browseInternet();   
      
   }

}
         


class BasicPhone {

  public void makeCall() {
   System.out.println("make call...");
  }

  public void receiveCall() {
     System.out.println("receive call...");
  }

  public void sendTextMsg() {
   System.out.println("send Text msg...");
  }

  public void receiveTextMsg() {
     System.out.println("receive text msg...");
  }

}

class SmartPhone extends BasicPhone {

  public void takePic() {
    System.out.println("take pic...");
  }

  public void browseInternet() {
     System.out.println("browse internet...");
  }

}