import java.util.Scanner;

public class gfgfg {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);	
		String numb = in.next(); 
		int system1 = in.nextInt(); 
		int newSystem = in.nextInt(); 
		
		int nummDecI= Integer.parseInt(numb, system1);
		String nummDecS=Integer.toString(nummDecI);
		String nummNS=convert(nummDecI, newSystem).toString();
		
		System.out.println (numb + " (" + system1 + ")");
		System.out.println (nummDecS + " (10)");
		System.out.println (nummNS + " (" + newSystem + ")");	
	}
	static StringBuffer convert(int num, int ns)
	{
		 String y="";
		 int temp=0;
		 while (num!=0)
		 {
			 	temp = num%ns;	
			    
			 	if (temp==10)
			 		y+="A";
			 	else if (temp==11)
			 		y+="B";
			 	else if (temp==12)
			 		y+="C";
				else if (temp==13)
			 		y+="D";
				else if (temp==14)
			 		y+="E";
				else if (temp==15)
			 		y+="F";
				else y += temp;	
			 	
			    num = num/ns;  
		 }
	     StringBuffer x = new StringBuffer(y);
	     x=(new StringBuffer(y)).reverse();
	return x;
	
	}
}
