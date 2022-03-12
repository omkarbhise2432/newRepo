import java.util.Scanner;
public class LeapYear
{
	public static void main(String args[])
	{
		int year;
		System.out.println("Enter Year : " );
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		print_leap(year);
	}
	static void print_leap(int year)
	{
		if((year%4==0) && (year%100!=0))
		{ 
			System.out.println(year + " is a leap year.");
		}
		else if((year%4==0) && (year%100==0) && (year%400==0))
		{
			System.out.println(year + " is a leap year");
		}
		else
		{ 
			System.out.println(" Its not a Leap year");
		}
	}
}