package homework4;

public class Factor
{
	public int Factorial (int n) {
		if (n ==1)
			return 1;
		else
		return (n * Factorial (n-1));
	}
	
	
	public static int CountFactorial (int number) {
		int factorial = 1;
		for (int i = 2; i <=number; i++) {
			factorial *= i; 
		}
		return factorial;
		}
	
	
		
	public static void main(String[] args)
	{
		System.out.println(CountFactorial(3));
		
	}
}
