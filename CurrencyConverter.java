import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("	Currency Converter	");
		System.out.println();
		System.out.println("Enter the Currency (INR) : ");
		System.out.println();
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("List of Currency : ");
		System.out.println("USD");
		System.out.println("EUR");
		System.out.println("GBP");
		System.out.println("PKB");
		System.out.println("");
		String curr = sc.next().toUpperCase();
		
		float conCurr= 0;

		if (curr.equals("USD"))
		{
			// conCurr = inr*0.00
			conCurr = inr/86.95f;
			System.out.println(inr +" INR = "+ conCurr +" USD");
		}
		else if (curr.equals("EUR"))
		{
			conCurr = inr/90.28f;
			System.out.println(inr +" INR = "+ conCurr +" EUR");
		}
		else if (curr.equals("GBP"))
		{
			conCurr = inr/107.65f;
			System.out.println(inr +" INR = "+ conCurr +" GBP");
		}
		else if (curr.equals("PKB"))
		{
			conCurr = inr/0.3105f;
			System.out.println(inr +" INR = "+ conCurr +" PKB");
		}
		else{
			System.out.println("Invalid Input");
		}

	}
}
