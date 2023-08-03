package Thursdaylab_3Aug;
public class Student extends Teacher implements Person
{
	@Override
	public void speak() 
	{
		System.out.println("This is Student's Class");
	}
	public static void main(String [] args) 
	{
		Student s=new Student();								//Object creating of Child class
		Teacher t=new Teacher();								//Object creating of Parent class
		t.speak();												//calling the parent class function which is override by interface name Person
		s.speak();												//calling the child class function 
	}
}