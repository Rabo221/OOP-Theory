package Super1;

import Method_Overriding.Vehicle;

public class Bike extends Vehicle {
int speed=100;
void display()
{
	System.out.println(super.speed);
}


public static void main(String[] args)
{
	Bike b=new Bike();
	b.display();
}
}