import java.util.ArrayList;
import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in);		
		int a = in.nextInt();//��������� ����� �����
		String s = in.next();//��������� ������ �� ������� �������
		int b = in.nextInt();//��������� ����� �����
		
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
