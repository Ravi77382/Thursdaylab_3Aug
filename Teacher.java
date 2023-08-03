package Thursdaylab_3Aug;
public class Teacher implements Person 
{
	@Override
	public void speak()													//abstract method which is reused from the interface class Person
	{
		System.out.println("This is Teacher's Class");
	}
	public static String Grade(double marks)							//taking the marks from the user and then checking for the grade
	{
		if(marks>=90) 
		{
            return "A+";
        } 
		else if(marks>=80)
		{
            return "A";
        } 
		else if(marks>=70)
		{
            return "B";
        } 
		else if(marks>=60)
		{
            return "C";
        }
		else if(marks>=50)
		{
            return "D";
        }
		else 
		{
            return "F";
        }
	}
}