import java.util.Scanner;

class EvenOdd 
{
	public static void main(String[] args) 
	{

		//Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = new Scanner(System.in).nextInt();

		boolean sum = num/2 == num/2.0;
		System.out.println(sum);
		
		
		// logic for evenodd without using %
		// num /2 == num/2.0;      decimals can the value.
		// (num/2)*2 == num; 

		// using % 
		// num % 2 == 0;


		// ture = even
		// false = odd

		System.out.println(num);
	}
}
