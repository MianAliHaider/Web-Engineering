class Professor extends Staff
{
	private double fixedSalary;
	
	public Professor(String name,int ID,String department, double fixedSalary)
	{
		super(name,ID,department);
		this.fixedSalary=fixedSalary;
	}
	
	@Override
	public double calSalary()
	{
		return fixedSalary;
	}
	
	@Override
	public String toString() 
	{
		return super.toString()+", Fixed Salary: "+fixedSalary;
	}
}