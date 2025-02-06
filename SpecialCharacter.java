import java.util.Scanner;
class SpecialCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter character : ");
		char special = sc.next().charAt(0);

		String op = (special>='A' && special<='Z' || special>='a' && special<='z' || special>='0' && special<='9')?
			(special+" is not Special"):(special+" is Special");
		System.out.println(op);
	}
}
