package surya.com;

import java.util.Scanner;

public class InventoryManagementSystem
{
	public static void main(String[] args) 
	{
		ProductInventory inventory = new ProductInventory();
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
		    System.out.println(">>>>>>>>>>Inventory Management System Menu<<<<<<<<<<");
		    System.out.println("----------------------------------------------------");
		    System.out.println("1. Add a new product");
		    System.out.println("2. Remove a product");
		    System.out.println("3. Update the quality of a product");
		    System.out.println("4. Display details of a specific product");
	     	    System.out.println("5. Display details of all product");
	    	    System.out.println("6. Exit the Program");
	    	    System.out.println("----------------------------------------------------");
		    System.out.println("Choose your preffered option: ");
		    int choice=scanner.nextInt();
		    scanner.nextLine();
		    
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("\n----------------------------------------------------");
		    	System.out.println("   New Product");
		    	System.out.print("Enter product Name: ");
		    	String name = scanner.nextLine();
		    	System.out.print("Enter product ID: ");
		    	int id = scanner.nextInt();
		    	System.out.print("Enter Price: ");
		    	double price = scanner.nextDouble();
		    	System.out.print("Enter quantity: ");
		    	int quantity = scanner.nextInt();
		    	Product newProduct = new Product(id, name, price, quantity);
		    	inventory.addProduct(newProduct);
		    	System.out.println("Product Added Successfully");
		    	System.out.println("----------------------------------------------------\n");
		    	break;
		    case 2:
		    	System.out.println("\n----------------------------------------------------");
		    	System.out.print("Enter product ID to remove: ");
		    	int removeId = scanner.nextInt();
		    	inventory.removeProduct(removeId);
		    	System.out.println("Successfully product "+removeId+" ID removed");
		    	System.out.println("----------------------------------------------------\n");
		    	break;
		    case 3:
		    	System.out.println("\n----------------------------------------------------");
		    	System.out.print("Enter product ID to update quantity: ");
		    	int updateId = scanner.nextInt();
		    	System.out.print("Enter new Quantity: ");
		    	int newQuantity= scanner.nextInt();
		    	inventory.updateProductQuantity(updateId, newQuantity);
		    	System.out.println("----------------------------------------------------\n");
		    	break;
		    case 4:
		    	System.out.println("\n----------------------------------------------------");
		    	System.out.print("Enter a product ID to display specific Product: ");
		    	int displayId= scanner.nextInt();
		    	inventory.DisplayProductDetails(displayId);
		    	System.out.println("----------------------------------------------------\n");
		    	break;
		    case 5:
		    	System.out.println("\n----------------------------------------------------");
		    	System.out.println("Displaying all products");
		    	inventory.DisplayAllProducts();
		    	System.out.println("----------------------------------------------------\n");
		    	break;
		    case 6:
		    	System.out.println("\n----------------------------------------------------");
		    	System.out.println("Exiting the Program........ Thank You !");
		    	System.exit(0);
		    	break;
		    default:
		    	System.out.println("Invalid option");
		    scanner.close();
		    
		    }
		       
		}
		
	}

}
