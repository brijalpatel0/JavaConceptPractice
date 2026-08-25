package Opo_Programs;

// This is called function overloading and compile time polymorphism.
class calc
{
	//public int n1=10, n2=20, n3=30;
	
	public int addition(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int addition(int n1, int n2, int n3)
	{
		return n1 + n2 + n3 ;
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) 
	{
		calc obj = new calc();
		
		System.out.println("addition is : " + obj.addition(10, 20));
		System.out.println("addition is : " + obj.addition(10, 20, 30));

	}

}
