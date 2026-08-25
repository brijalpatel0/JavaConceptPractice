package BasicPrograms;

public class GradeSystem {

	public static void main(String[] args) 
	{
		int s1,s2,s3,total,avg;
		s1 = 40; 
		s2 = 40;
		s3 = 40;
		
		total = s1+s2+s3;
		System.out.println("Total is : " + total);
		
		avg = total/3;
		System.out.println("Average is : " + avg);
		
		if(avg >= 70) 
		{
			System.out.println("First Class");
		}
		else if(avg >= 50 && avg < 70)
		{
			System.out.println("Second Class");
		}
		else if(avg >= 35 && avg < 50)
		{
			System.out.println("Third Class");
		}
		else 
		{
			System.out.println("Fail");
		}
		
	}

}
