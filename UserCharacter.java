import java.util.Scanner;
class UserCharacter 
{
	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next().toUpperCase();
		System.out.println(name);
		int len = name.length();
		System.out.println(len);

		for (int i=0; i<=len-1 ;i++ )
		{
			System.out.print(name.charAt(i));
			Thread.sleep(1000);
		}
	}
}
