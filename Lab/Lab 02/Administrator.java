class Administrator extends Staff
{
	private double baseSalary;
	private double performanceBonus;
	
	public Administrator(String name,int ID,String department, double baseSalary, double performanceBonus)
	{
		super(name,ID,department);
		this.baseSalary=baseSalary;
		this.performanceBonus=performanceBonus;
	}
	
	@Override
	public double calSalary()
	{
		return baseSalary + performanceBonus;
	}
	
	@Override
    public String toString() {
        return super.toString()+", Base Salary: "+baseSalary+", Performance Bonus: "+performanceBonus;
    }
}

