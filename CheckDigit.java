import java.util.Scanner;
class CheckDigit
{
	public static void main(String[] args) 
	{
		// hitwo, hifive

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int num = sc.nextInt();

		//String op = (num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):((num%2==0 && num%5==0)?("HiTwoFive"):("blank")));

		//String op= (num%2==0)?((num%2==0 && num%5==0)?("HitwoFive"):("hitwo")):((num%5==0)?("hifive"):("_"));

		String op = (num%2==0 && num%5==0)?("hitwoFive"):((num%5==0)?("HiFive"):((num%2==0)?("hitwo"):("_")));

		System.out.println(op);
		
	}
}
