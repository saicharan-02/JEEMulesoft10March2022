public class HasARelationDemo {

  public static void main(String[] args) {

   Author author1 = new Author(111,"James", "james@tmail.com");

   Book book1 = new Book(10,"Java In Action",600, author1);

   int id = book1.getBookId();
   String  title = book1.getTitle();
   double price = book1.getPrice();
   Author bookAuthor = book1.getAuthor();

   System.out.println("Book Details");
   System.out.println("BookId: "+id);
   System.out.println("Title: "+title);
   System.out.println("Price: "+price);
    
   String authorName = bookAuthor.getName();
   String authorEmail = bookAuthor.getEmail();

   System.out.println("Author Details:");
   System.out.println("Name :"+authorName);
   System.out.println("Email :"+authorEmail);
  
  }

}

class Book {

   private int bookId;
   private String title;
   private double price;
   private Author author;

   Book(int bookId, String title, double price, Author author) {
     this.bookId = bookId;
     this.title = title;
     this.price = price;
     this.author = author;
   }

   public int getBookId() {
      return bookId;
   }   
   public String getTitle() {
      return title;
   }
   public double getPrice() {
      return price;
   }
   public Author getAuthor() {
     return author;
   }  

}


class Author {

   private int authorId;
   private String name;
   private String email;

   Author(int authorId,String name, String email) {
    this.authorId = authorId;
    this.name = name;
    this.email = email;
   }

  public int getAuthorId() {
    return authorId;
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }

 }