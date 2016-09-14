import java.util.ArrayList;
import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in);		
		int a = in.nextInt();//считываем целое число
		String s = in.next();//считываем строку до первого пробела
		int b = in.nextInt();//считываем целое число
		
		int result = calculation(a,b,s);
		System.out.println(" = " + result);
	}
	
	static int calculation(int a, int b, String s)
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
