package Inheritance_Example;

public class Girl extends Human{

	public void eat()
	{
		System.out.println("Girl eats.");
	}
	
	public static void main(String[] args)
	{
		 Girl x=new Girl();
		 x.eat();
	}
}