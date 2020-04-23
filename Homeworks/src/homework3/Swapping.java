package homework3;

public class Swapping
{
	public static void main(String[] args)
	{
		int a = 24;
		int b = 67;
		a = a +b; // a + 24+67=91 // a += b    
		b = a - b; // 91-67=24  // b -= a 
		a = a - b; // 91-24=67
		System.out.println(a);
		System.out.println(b);
		System.out.println();
// b = 24 ; 
// a = 67; 
	}
}
