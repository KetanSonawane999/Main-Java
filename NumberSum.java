import java.util.Scanner;
class NumberSum 
{
	public static void main(String[] args) 
	{

		System.out.println("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println();
		int temp = num;
		int sum =0;

		while (num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num /=10;
		}
		System.out.println("Sum : "+sum);
		System.out.println("number : "+temp);
	}
}
