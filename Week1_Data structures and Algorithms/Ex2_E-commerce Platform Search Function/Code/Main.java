package Code;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Education"),
            new Product(104, "Phone", "Electronics")
        };

        Product foundLinear = Search.linearSearch(products, "Book");
        if (foundLinear != null) {
            System.out.println("Linear Search: Found -> " + foundLinear.productName);
        } else {
            System.out.println("Linear Search: Product not found");
        }

        Search.sortProducts(products); 
        Product foundBinary = Search.binarySearch(products, "Book");
        if (foundBinary != null) {
            System.out.println("Binary Search: Found -> " + foundBinary.productName);
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}
