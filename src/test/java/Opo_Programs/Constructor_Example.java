package Opo_Programs;

class demo_constructor
{
	public int x =10,y=20;
	
	public demo_constructor()
	{
		System.out.println("this is example of constructor");
	}
	
	public int addition()
	{
		return x+y;
	}
}

public class Constructor_Example {

	public static void main(String[] args) 
	{
		demo_constructor obj = new demo_constructor();

	}

}
