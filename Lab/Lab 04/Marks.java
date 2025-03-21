import java.util.*;

class InvalidMarksException extends Exception
{	
	String value;
	
	InvalidMarksException(String v)
	{
		value=v;
	}
	
	public String toString()
	{
		return "Exception: "+value; 
	}
}

class Student
{
	String name;
	double marks;
	
	public Student(String name,double marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public String assignGrade() throws InvalidMarksException
	{
		if (marks < 0 || marks > 100) 
		{
            throw new InvalidMarksException("Number must be between 0 and 100. You enter: "+marks);
        }
        else if (marks >= 85) 
		{
            return "A";
        }
        else if (marks >= 70 && marks <=84) 
		{
            return "B";
        }
        else if (marks >= 50 && marks <= 69) 
		{
            return "C";
        }
        return "F";
    }
}

class Marks
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		try
		{	
			System.out.println("Enter Student Name");
			String name=in.nextLine();
			System.out.println("Enter Student Marks: ");
			double marks = in.nextDouble();
		
			Student std = new Student(name,marks);
			String grd = std.assignGrade();
			System.out.println("Student "+name+" Received Grade: "+grd);
		}
	
		catch(InvalidMarksException e)
		{
			System.out.println("Exception: "+e);
		}	
		finally
		{
			System.out.println("Grade Assigned Successfully.");
		}
	}	
}