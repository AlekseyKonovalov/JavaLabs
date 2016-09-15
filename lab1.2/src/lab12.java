import java.util.ArrayList;
import java.util.Scanner;


public class lab12 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);		
		double a = in.nextDouble();
		String s = in.next();
		double b = in.nextDouble();
		
		double result = calculation(a,b,s);
		System.out.println(" = " + result);
	}
	static double calculation(double a, double b, String s)
	{
		switch(s)
		{
		case "*":
			return a*b;			
			
		case "/":
			return a/b;			
			
		case "-":
			return a-b;				
			
		case "+":
			return a+b;		
		
		default: return 0;
		}					
	}
}
