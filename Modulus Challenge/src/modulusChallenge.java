import java.util.Scanner;

public class modulusChallenge
	{
		public static void main(String[] args)
		{
			challenge1();
			challenge2();
//			challenge3();
		}
		
    static int x = 0;
    static int y = 0;
    static int z = 0;
    static int year = 0;
    
	public static void challenge1()
	{
		Scanner userInput =new Scanner (System.in);
		System.out.println("Pick a year!");
		year = userInput.nextInt();
		if (year % 4 == 0)
			System.out.println(year + " It is a leap year");
		else 
			System.out.println(year + " It is not a leap year");
		
		if (year % 100 == 0)
			System.out.println(year + " It is not a leap year");
	}
	
	public static void challenge2()
	{
		int [] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	}
	
	public static void challenge3()
	{ 
		for(int y = 0; y < 101; y++)
			{
				if (y % 3 == 0)
					System.out.println("Fizz");
			
		        if (y % 5 == 0)
			        System.out.println("Buzz");
		
		        if (y % 3 == 0 && y % 5 == 0)
			        System.out.println("Fizz Buzz");
			}
	   }
	
	}
