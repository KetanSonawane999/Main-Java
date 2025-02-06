import java.util.Scanner;

class DemoIf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num>=1 && num<=6)
		{
			System.out.println("num is between 1 to 6");
		}
		System.out.println("Hello World!");
	}
}
