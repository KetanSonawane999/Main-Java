import java.util.Scanner;
class Characters 
{
	public static void main(String[] args) 
	{

		// Character is upper case and lower case 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char : ");
		char ch = sc.next().charAt(0);

		//String ans =(ch>='A' && ch<='Z')?("Upper case"):("Lowwer Case");
		System.out.println((ch>='A' && ch<='Z')?("Upper case"):("Lowwer Case"));
		

		
	}
}