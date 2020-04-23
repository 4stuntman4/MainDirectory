package conditions;

public class UseSwitch
{
	public static void main(String[] args)
	{

		int index = 8;
// 1 
		System.out.println("1. Old switch");
		switch(index) 
		{
			case 1:
				System.out.println("1 case");
				break;
			case 2:
				System.out.println("2 case");
				break;
			case 3:
				System.out.println("3 case");
				break;
				default:
					System.out.println("default case");
		}
		
		System.out.println();
		
//2 
		System.out.println("2. New simple switch");
		index = 4;
		switch(index)
		{
			case 1 -> System.out.println("1 case");
			case 2 ->System.out.println("2 case ");
			case 3 ->System.out.println("3 case");
			default-> System.out.println("default case");
		}
		
		System.out.println(); // devide strings 
//3
		 System.out.println("3. Multiple case labels");
		 index = 12;
		 switch(index)
		 {
			 case 0 -> System.out.println("0 case");
			 case 1,3,5,7,9 -> System.out.println("odd case");
			 case 2,4,6,8,10 ->System.out.println("even case");
			 default -> {
				 System.out.println("\tThis is the first line in default");
				 System.out.println("\nThis is the second line in default");
			 }
		 }
//4 
		 char c = 'a';
		 switch(c)
		 {
			 case 'a' -> System.out.println();
		 }
	}
}


