package Opo_Programs;

class WhileLoop {

	public void printvalue()
	{
		{
			int i = 2;
			
			while(i<=10)
			{
				System.out.println(i);
				i = i+2;
			}

		}
	}
	

}

public class WhileLoop_class {

	public static void main(String[] args) 
	{
		
		WhileLoop result = new WhileLoop();
		result.printvalue();

	}

}
