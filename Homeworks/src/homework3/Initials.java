package homework3;

public class Initials
{
	public static void main(String[] args)
	{
		String name = "Donald Trump";
		for (int i = 0; i < name.length(); i++)
		{
			if (name.charAt(i) == ' ')
			{
				if (name.charAt(i + 1) == ' ')
					continue;
				else
				{
					System.out.println(name.charAt(0));
					System.out.println(name.charAt(i+1));
					break;
				}
			}
		}
	}
}

