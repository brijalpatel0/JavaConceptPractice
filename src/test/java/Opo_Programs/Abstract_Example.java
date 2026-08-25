package Opo_Programs;


abstract class Fruit
{
	
	public void display1()
	{
		System.out.println("Method 1 : Non abstratct");
	}
	
	abstract public void display2();
	
}


class body extends Fruit
{
	public void display2()
	{
		System.out.println("Method 2:");
	}
}

public class Abstract_Example {

	public static void main(String[] args) {
		
		body obj = new body();
		obj.display1();
		obj.display2();
		
	}

}