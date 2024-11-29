package surya.com;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductInventory
{
	HashMap<Integer, Product> inventory = new HashMap<>();
	ArrayList<Product> productList = new ArrayList<>();
	
	//Add Product
	public void addProduct(Product product)
	{
		inventory.put(product.getProductId(), product);
		productList.add(product);
	}
	
	//Remove Product
	public void removeProduct(int productId)
	{
		if(inventory.containsKey(productId))
		{
			productList.remove(inventory.get(productId));
		}
		else
		{
			System.out.println("Product with ID "+productId+" not found");
		}
	}
	
	//Update Product Quantity
	public void updateProductQuantity(int productId, int newQuantity)
	{
		if(inventory.containsKey(productId))
		{
			Product product = inventory.get(productId);
			product.setQuantity(newQuantity);
			inventory.put(productId, product);
		}
		else
		{
			System.out.println("Product with "+productId+" ID not found");
		}
	}
	
	//Display specific Product
	public void DisplayProductDetails(int productId)
	{
		if(inventory.containsKey(productId))
		{
			Product product = inventory.get(productId);
			System.out.println(product);
		}
		else
		{
			System.out.println("Product with "+productId+" ID not found");
		}
		
	}
	
	//Display All Products
	public void DisplayAllProducts()
	{
		for(Product product: productList)
		{
			System.out.println(product);
		}
	}

}
