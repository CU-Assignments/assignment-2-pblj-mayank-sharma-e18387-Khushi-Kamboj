package src;
class Product {
    // Attributes
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Product {
    public static void main(String[] args) {
        // Creating a Product object
        Product product = new Product(101, "Laptop", 75000);

        // Display product details
        product.displayProductDetails();
    }
}
