import java.util.Scanner;

class Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the digit : ");
		char digit = sc.next().charAt(0);
		
		String op = (digit>='0' && digit<='9')?(digit +" is Digit"):(digit +" is not Digit");
		System.out.println(op);

		
	}
}
