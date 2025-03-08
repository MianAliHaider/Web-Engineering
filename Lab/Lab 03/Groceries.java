class Groceries extends BaseProduct
{
	String expirationDate;
	
	public Groceries(String name,double price,int stock,String expirationDate)
	{
		super(name,price,stock);
		this.expirationDate=expirationDate;
	}
	
	public double calculate()
	{
		if (stock>5)
		{
			return price*0.92;
		}
		return price;
	}
	public String getDetails()
	{
		return super.getDetails() + " Expiration Details: "+expirationDate;
	}
}