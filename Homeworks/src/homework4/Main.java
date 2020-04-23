package homework4;
public class Main
{
	public static void main(String[] args)
	{
		String str1 = "Bad credit";
		String str2 = "Debit card";
		
		Anagram compare = new Anagram ();
		
		//compare.isAnagram(str1, str2);
		System.out.println(compare.isAnagram(str1, str2));
		
	}
}
