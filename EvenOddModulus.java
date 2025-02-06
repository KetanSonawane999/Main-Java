import java.util.Scanner;

class EvenOddModulus 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		boolean sum = num%2==0;
		System.out.println(sum);
	}
}
