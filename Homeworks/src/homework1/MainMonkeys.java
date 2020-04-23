package homework1;

public class MainMonkeys
{
	public static void main(String[] args)
	{
		
		Monkeys m = new Monkeys(); // new object pomogaet obratitsya k peremennoy
			boolean result = m.monkeyTrouble(true, true);        // to obrashaemsia to method and insert new  variable 
			boolean result2 = m.monkeyTrouble(false, true); 
		//	boolean result3 = m.monkeyTrouble(false, false); 
		  //  System.out.println("We have a trouble: " + result3);
			System.out.println("We do not have a trouble: " + result);
	        System.out.println("We have a trouble: " + result2);
	}
}
