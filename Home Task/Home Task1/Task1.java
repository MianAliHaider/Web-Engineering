import java.util.*;

public class Task1
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total count of numbers you want to enter: ");
		int count = in.nextInt();
		int[] array = new int[count];
		for(int i=0; i<count; i++)
		{
			array[i]=in.nextInt();
		}
		int min=array[0];
		int max=array[0];
		for(int i=1; i<count;i++)
		{
			if (array[i]<min)
			{
				min=array[i];
			}
		}
		for(int i=0; i<count;i++)
		{
			if (array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Minimum Number from array is: "+min);
		System.out.println("Maximum Number from array is: "+max);
	}
}