package src;
// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class for Fiction
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

// Derived class for Non-Fiction
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating Fiction and Non-Fiction book objects
        Book fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        Book nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        // Displaying book details
        fictionBook.displayDetails();
        System.out.println();  // Empty line between the two book details
        nonFictionBook.displayDetails();
    }
}
