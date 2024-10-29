import java.util.*;

 // Compiler version JDK 11.0.2

 class Book{
   int bookNum;
   String title;
   String author;
   int yearPublished;
   double price;
   
 public Book(int bookNum, String title, String author, int yearPublished, double price) {
   this.bookNum = bookNum;
   this.title = title;
   this.author = author;
   this.yearPublished = yearPublished;
   this.price = price;
   
 }
 public void Details(){
   System.out.println("Book: "+ bookNum);
   System.out.println("Title: "+ title);
   System.out.println("Author: "+ author);
   System.out.println("YearPublished: "+ yearPublished);
   System.out.println("Price: $"+ price);
   System.out.println("");
   }
 }
 public class BOOK{
   public static void main(String[]args){
     Book book1 = new Book(1,"The $100 Startup","Chris Guillebeau", 2021,10.99);
     Book book2 = new Book(2,"The 7 habits of highly Effective people","Stephen Covey",1989,11.99);
     Book book3 = new Book(3,"Start with why","Simon Sinek",2011,12.99);
    
     book1.Details();
     book2.Details();
     book3.Details();
   }
 }