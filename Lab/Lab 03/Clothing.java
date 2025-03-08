class Clothing extends BaseProduct
{
	String size;
	String material;
	
	public Clothing(String name,double price,int stock,String size,String material)
	{
		super(name,price,stock);
		this.size=size;
		this.material=material;
	}
	
	public double calculate()
	{
		if (stock<5)
		{
			return price*0.95;
		}
		return price;
	}
	public String getDetails()
	{
		return super.getDetails() + " Size: "+size+" Materail: "+material;
	}
}