import java.util.Scanner;

public class lab13 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);	
		
		String numb = in.next();//считываем строку до первого пробела
		int system1 = in.nextInt();//считываем целое число
		int newSystem = in.nextInt();//считываем целое число
		
	
		
		int nummDecI= Integer.parseInt(numb, system1);
		String nummDecS=Integer.toString(nummDecI);
		String nummNS=convert(nummDecI, newSystem).toString();
		
		System.out.println (numb + " (" + system1 + ")");
		System.out.println (nummDecS + " (10)");
		System.out.println (nummNS + " (" + newSystem + ")");

	}
	static StringBuffer convert(int temp, int ns)
	{
		 String y="";
		// if (ns<10)
		// {
		 while (temp!=0)
		 {
			    y += temp%ns;			   
			    temp = temp/ns;   			    
		 }
		 
	     StringBuffer x = new StringBuffer(y);
	     x=(new StringBuffer(y)).reverse();
	     
		return x;
		// }
		//return y;
	}

}
