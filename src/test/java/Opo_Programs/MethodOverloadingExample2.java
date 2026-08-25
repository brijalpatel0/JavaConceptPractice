package Opo_Programs;

class calc1
{
	
	public int Multiplication(int n1, int n2)
	{
		return n1 * n2;
	}
	
	public int Multiplication(int n1, int n2, int n3)
	{
		return n1 * n2* n3;
	}
}

public class MethodOverloadingExample2 {

	public static void main(String[] args) 
	{
		calc1 obj = new calc1();
		
		System.out.println("Multiplication is : " + obj.Multiplication(10, 20));
		System.out.println("Multiplication is : " + obj.Multiplication(10, 20, 30));
		
	}

}
