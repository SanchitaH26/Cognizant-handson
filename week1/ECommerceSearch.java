import java.util.Arrays;
import java.util.Comparator;
class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println();
    }
}
public class ECommerceSearch {
    public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == id) {
                return products[mid];
            }
            else if (products[mid].productId < id) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return null;
    }    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Book", "Education")
        };
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, 103);
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        System.out.println("Binary Search Result:");
        Product result2 = binarySearch(products, 105);
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
        System.out.println("Time Complexity Analysis:");
        System.out.println("Linear Search:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(n)");
        System.out.println("Worst Case: O(n)");
        System.out.println();
        System.out.println("Binary Search:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(log n)");
        System.out.println("Worst Case: O(log n)");
    }
}