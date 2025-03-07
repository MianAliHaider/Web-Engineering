class Lecturer extends Staff
{
	private int lectureDelivered;
	private double payPerLecture;
	
	public Lecturer(String name,int ID,String department, int lectureDelivered, double payPerLecture)
	{
		super(name,ID,department);
		this.lectureDelivered=lectureDelivered;
		this.payPerLecture=payPerLecture;
	}
	
	@Override
	public double calSalary()
	{
		return lectureDelivered * payPerLecture;
	}
	
	@Override
	public String toString()
	{
		 return super.toString()+", Lectures Delivered: "+lectureDelivered+", Pay Per Lecture: ";
	}
}