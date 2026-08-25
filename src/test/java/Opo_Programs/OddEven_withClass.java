package Opo_Programs;

class OddEven
{

	public int number=35;
	
	public void printvalue()
	{
		
		
		if(number%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}

public class OddEven_withClass {

	public static void main(String[] args) {
		
		OddEven result = new OddEven();
		result.printvalue();

	}

}
