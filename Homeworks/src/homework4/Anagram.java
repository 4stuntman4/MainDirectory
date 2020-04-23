package homework4;
import java.util.Arrays;

public class Anagram
{
	public boolean isAnagram(String str1, String str2) {
		char[]ch1 = str1.toLowerCase().toCharArray();
		char[]ch2 = str2.toLowerCase().toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	str1 = new String(ch1);
    str2 = new String(ch2);
    System.out.println(str1);
    System.out.println(str2);
    
    return str1.equals(str2);
    
	}
}
