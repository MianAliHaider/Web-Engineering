class Electronics extends BaseProduct
{
	int warranty;
	
	public Electronics(String name,double price,int stock,int warranty)
	{
		super(name,price,stock);
		this.warranty=warranty;
	}
	
	public double calculatePrice()
	{
		if (price > 1000)
		{
			return price*0.9;
		}
		return price;
	}
	
	public String getDetails()
	{
		return super.getDetails()+" Warranty: "+warranty; 
	}
}
