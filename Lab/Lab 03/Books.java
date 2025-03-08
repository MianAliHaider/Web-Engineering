class Books extends BaseProduct
{
	String AuthorName;
	
	public Books(String name,double price,int stock,String AuthorName)
	{
		super(name,price,stock);
		this.AuthorName=AuthorName;
	}
	
	public double calculate()
	{
		if (price>50)
		{
			return price*0.93;
		}
		return price;
	}
	public String getDetails()
	{
		return super.getDetails() + " Author Name: "+AuthorName;
	}
}