class ConstructorDemo {

   public static void main(String[] args) {
    
    Rectangle rect1 = new Rectangle(10,20); 

    double rectArea1 = rect1.area();

    System.out.println("Area:"+rectArea1); 

    Rectangle rect2 = new Rectangle(5,10); 

    Rectangle rect3 = new Rectangle(50,20);   

    Rectangle rect4 = new Rectangle();

    Rectangle rect5 = new Rectangle(20);

  }

}

  class Rectangle {

    private int length;
    private int breadth;  

    Rectangle() {

    }  

    Rectangle(int l) {

    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }  
  
    double area() {
      double result = length*breadth;
      return result;
    }

   }

   
