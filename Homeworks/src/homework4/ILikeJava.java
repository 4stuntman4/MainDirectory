package homework4;

public class ILikeJava
{
	public static void main(String[] args)
	{
		
		String str1 = "I  like  Java";
		String str2 = "";
		String arr[] = str1.split(" ");
		//System.out.println(arr);
		
		for (int i = arr.length - 1; i >=0; i--) {
		
			str2 = str2 + arr[i] + " ";
		
		}
		System.out.println(str2.trim());
	}	
}
