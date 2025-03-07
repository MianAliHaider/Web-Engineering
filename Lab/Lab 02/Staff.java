abstract class Staff
{
	String name;
	int ID;
	String department;
	
	public Staff(String name, int ID, String department)
	{
		this.name=name;
		this.ID=ID;
		this.department=department;
	}
	
	public abstract double calSalary();
	
	public String toString() 
	{
		return "ID: "+ID+", Name: "+name+ ", Department: "+department;
	}
}



