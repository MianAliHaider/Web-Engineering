import java.util.*;

class BaseProduct implements Product
{
	String name;
	double price;
	int stock;
	
	public BaseProduct(String name,double price,int stock)
	{
		try
		{
			if (price<0 || stock<0) 
			{	
				System.out.println("Error: Price or stock cannot be negative.");
			}
			else
			{
				this.name=name;
				this.price=price;
				this.stock=stock;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		finally
		{
			System.out.println("Product Proceessing Complete");
		}
	}
	
	public double calculatePrice()
	{
		return price;
	}
	
	public String getDetails()
	{
		return "Product: "	+name+" Price: "+price+" Stock: "+stock;
	}
}