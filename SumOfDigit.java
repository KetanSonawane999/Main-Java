import java.util.Scanner;

class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int rem = 0;

		rem = num%10;
		sum  = sum + rem;
		num = num/10;
		System.out.println("1st : "+sum);		
		System.out.println("1st : "+rem);
		
		rem = num %10;
		sum = sum + rem;
		num = num/10;
		System.out.println("2nd : "+sum);		
		System.out.println("2nd : "+rem);

		rem = num%10;
		sum = sum + rem;
		num = num/10;
		System.out.println("3nd : "+sum);		
		System.out.println("3nd : "+rem);


		System.out.println("Toatal Sum of Digit is : "+ sum);


		

	/*	num = num + num%10;
		System.out.println(num);

		num = num + num%10;
		System.out.println(num);*/
	}
}
