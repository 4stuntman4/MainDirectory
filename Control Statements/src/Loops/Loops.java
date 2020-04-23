package Loops;

public class Loops
{
	public static void main(String[] args)
	{
// while 
		int count = 11;
		while (count < 11)
		{
			System.out.println("Count is while" + count);
			count++;
		}
		System.out.println();
// do while
		count = 11;
		do
		{
			System.out.println("Count is do while" + count);
			count++;
		}
		while (count < 11);
		System.out.println();
// for 
		for ( int i = 1; i < 11; i++)
			System.out.println("Count is for" + i);
	}
}
