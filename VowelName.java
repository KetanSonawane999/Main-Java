import java.util.Scanner;
class VowelName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name : ");
		String name  = sc.next().toUpperCase();
		System.out.println(name);

		int len = name.length();
		System.out.println(len);


		for (int i=0; i<=len-1; i++)
		{

			if (name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U')
			{
				System.out.println(name.charAt(i) + " : " + i);
			}
		}

	}
}
