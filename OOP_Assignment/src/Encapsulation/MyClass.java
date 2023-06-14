package Encapsulation;

public class MyClass{

	public static void main(String[] args)
	{
		Person x= new Person("Rabo", 23);
	//	x.setName("Juss");
	//	x.setId(20);
		System.out.println("Name : "+x.getName()+ "; Age : "+x.getId());
	}
}
