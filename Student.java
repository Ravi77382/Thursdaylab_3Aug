package Thursdaylab_3Aug;
import java.util.*;
public class Student extends Teacher implements Person
{
	@Override
	public void speak()											//Abstract method reused 
	{
		System.out.println("This is Student's Class");
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        double marks=sc.nextDouble();
        String grade=Grade(marks);
        System.out.println("Grade: " + grade);
        Student s=new Student();
        Teacher t=new Teacher();
        s.speak();
        t.speak();
	}
}