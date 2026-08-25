package Opo_Programs;

class a 
{
	public void display1() 
	{
		System.out.println("method 1");
	}
}

class b extends a
{
	public void display2() 
	{
		System.out.println("method 2");
	}
}
public class InheretanceExample {

	public static void main(String[] args) 
	{
		b obj = new b();
		obj.display1();
		obj.display2();

	}

}
