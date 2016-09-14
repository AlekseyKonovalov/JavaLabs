import java.util.ArrayList;

public class lab11 {

	public static void main(String[] args)
	{
	
		ArrayList<Long> ArrInt = new ArrayList<Long>();
		 
		for (String argument : args)
		{			
			ArrInt.add (Long.parseLong(argument));			 
		}
		
		for (int i=0 ; i< ArrInt.size(); i++)
		{
			long temp =ArrInt.get(i);
			 
			
			if ((temp > -128) && (temp <127))
			{
				System.out.println(temp + " byte");//вывод
			}
			else if ((temp > -32768) && (temp <32767))
			{
					System.out.println(temp + " short");//вывод
			}
			else if ((temp > -2147483648) && (temp <2147483647))
			{
					System.out.println(temp + " int");//вывод
			}
			else System.out.println(temp + " long");//вывод		
			
		}
	}
}
