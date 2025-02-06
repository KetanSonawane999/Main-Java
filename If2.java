import java.util.Scanner;

class If2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter yes or no : ");
		boolean ans = sc.nextBoolean();

		if (ans)
		{
			System.out.println("You can ride");
		}

		System.out.println("Take a ticket ");
	}
}
