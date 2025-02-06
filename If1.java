import java.util.Scanner;

class If1 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Bill : ");
		float bill = sc.nextFloat();

		if (bill>2000)
		{

			bill -=(bill*0.1);       // 0.1 for 10% discount
			//System.out.println("Discount amount is : "+ bill);

		}

		System.out.println("Pay this bill : "+bill);


	}
}
