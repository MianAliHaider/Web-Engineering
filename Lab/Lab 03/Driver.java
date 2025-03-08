import java.util.*;

public class Driver 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Select Product Type: Electronics, Clothing, Groceries, Books");
        String choice = in.nextLine().toLowerCase();

        System.out.print("Enter Product Name: ");
        String name = in.nextLine();
        System.out.print("Enter Price: ");
        double price = in.nextDouble();
        System.out.print("Enter Stock: ");
        int stock = in.nextInt();
        in.nextLine();

        Product product = null;

        if ("electronics".equals(choice)) 
		{
            System.out.print("Enter Warranty (months): ");
            int warranty = in.nextInt();
            product = new Electronics(name, price, stock, warranty);
        } 
		else if ("clothing".equals(choice)) 
		{
            System.out.print("Enter Size (S/M/L/XL): ");
            String size = in.nextLine();
            System.out.print("Enter Material: ");
            String material = in.nextLine();
            product = new Clothing(name, price, stock, size, material);
        } 
		else if ("groceries".equals(choice)) 
		{
            System.out.print("Enter Expiration Date (YYYY-MM-DD): ");
            String expirationDate = in.nextLine();
            product = new Groceries(name, price, stock, expirationDate);
        } 
		else if ("books".equals(choice)) 
		{
            System.out.print("Enter Author Name: ");
            String author = in.nextLine();
            product = new Books(name, price, stock, author);
        } 
		else {
            System.out.println("Invalid selection.");
            return;
        }

        if (product != null) {
            System.out.println(product.getDetails());
            System.out.println("Final Price: $" + product.calculatePrice());
        }
    }
}
