package OOPS;

//Define the Book class
class Book {
 // Attributes of the Book class
 String title;
 String author;
 double price;

 // Parameterized constructor
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: $" + price);
 }
}

//Main class to test the Book class
public class Main {
 public static void main(String[] args) {
     // Create instances of Book using the parameterized constructor
     Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 18.99);
     Book book2 = new Book("1984", "George Orwell", 15.99);
     Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

     // Display details of each book
     System.out.println("Book 1 Details:");
     book1.displayDetails();

     System.out.println("\nBook 2 Details:");
     book2.displayDetails();

     System.out.println("\nBook 3 Details:");
     book3.displayDetails();
 }
}
