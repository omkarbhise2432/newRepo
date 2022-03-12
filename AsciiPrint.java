
import java.util.Scanner;
public class AsciiPrint {

	public static void main(String[] args) 
	{
	         System.out.println("Enter the Character:");
	         Scanner sc = new Scanner(System.in);         
	         char ch  =sc.next().charAt(0);
	         int ascii = ch; 
	         System.out.println("ASCII value of character: " + ascii  );        
	}

}