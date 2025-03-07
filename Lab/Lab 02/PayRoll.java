import java.util.*;
class PayRoll 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of Employess: ");
		int n = in.nextInt();
        Staff[] staffList = new Staff[n];

         for (int i=0; i<n; i++) 
		 {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("ID: ");
            int ID = in.nextInt();
            System.out.print("Department: ");
            String department = in.next();
            System.out.print("Role (1-Professor, 2-Lecturer, 3-Administrator, 4-ResearchAssistant): ");
            int role = in.nextInt();

            if (role == 1) 
			{
				System.out.print("Fixed Salary: ");
				double fixedSalary = in.nextDouble();
				staffList[i] = new Professor(name, ID, department, fixedSalary);
			} 
			else if (role == 2) 
			{
				System.out.print("Lectures Delivered: ");
				int lecturesDelivered = in.nextInt();
				System.out.print("Pay Per Lecture: ");
				double payPerLecture = in.nextDouble();
				staffList[i] = new Lecturer(name, ID, department, lecturesDelivered, payPerLecture);
			} 
			else if (role == 3) 
			{
				System.out.print("Base Salary: ");
				double baseSalary = in.nextDouble();
				System.out.print("Performance Bonus: ");
				double performanceBonus = in.nextDouble();
				staffList[i] = new Administrator(name, ID, department, baseSalary, performanceBonus);
			} 
			else if (role == 4) 
			{
				System.out.print("Stipend: ");
				double stipend = in.nextDouble();
				System.out.print("Research Grant: ");
				double researchGrant = in.nextDouble();
				staffList[i] = new ResearchAssistant(name, ID, department, stipend, researchGrant);
			} 
			else 
			{
				System.out.println("Invalid role!");
				i--;
			}
        }

        System.out.println("\nStaff Details and Salaries:");
        for (Staff staff : staffList) 
		{
            System.out.println(staff);
            System.out.println("Salary: $" + staff.calSalary());
        }
    }
}