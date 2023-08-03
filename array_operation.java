package Thursdaylab_3Aug;
import java.util.Scanner;
public class array_operation 
{
	int i,size,grt,sml;														//Declaration of variable or initialization
	int [] numb;															//Creating an Array to accept from the user
	Scanner sc=new Scanner(System.in);
	public int[] accept()													//Accepting the values from user for Array Operations
	{
		System.out.println("Enter the size: ");
		size=sc.nextInt();													//Accepting the Size of array from the user
		System.out.println("Enter "+size+" numbers: ");
		int[] num=new int[size];
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		return num;
	}
	public void greatest()													//Greatest Number logic
	{
		System.out.println("Greatest Number Program");
		numb=accept();
		grt=numb[0];
		for(i=0;i<numb.length;i++)
		{
			if(grt<numb[i])
			{
				grt=numb[i];
			}
		}
		System.out.println("The greater no is ="+grt);
	}
	public void smallest()													//Smallest Number logic
	{
		System.out.println("Smallest Number Program");
		numb=accept();
		sml=numb[0];
		for(i=0;i<numb.length;i++)
		{
			if(sml>numb[i])
			{
				sml=numb[i];
			}
		}
		System.out.println("The smallest no is ="+sml);
		
	}
	public static void main(String[] args) 
	{
		array_operation obj=new array_operation();							//Creating the object to call the functions
		obj.greatest();													
		obj.smallest();
	}

}
