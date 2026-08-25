package Opo_Programs;

interface i1
{
	public void display1();
	public void display2();
}

interface i2
{
	public void display3();

}

class abc implements i1,i2
{
	public void display1() 
	{
		System.out.println("Method 1");
	}
	public void display2()
	{
		System.out.println("Method 2");
	}
	public void display3()
	{
		System.out.println("Method 3");
	}

}


public class Interface_Example {

	public static void main(String[] args) 
	{
		abc obj =new abc();
		obj.display1();
		obj.display2();
	}

}
