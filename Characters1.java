import java.util.Scanner;

class Characters1 
{
	public static void main(String[] args) 
	{

		// check char, digit, special 


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : ");

		char ch = sc.next().charAt(0);
		String op = /*(ch>='A' && ch<='Z' || ch>=97 && ch<=122)?
			((ch>='a' && ch<='z')?(ch + " is lower case"):(ch + " is uppercase")):
			((ch>='0' && ch<='9')?(ch +" Digit"):
			(ch+" Special Character"));*/

		(ch>='A' && ch<='Z' || ch>='a' && ch<='z' )?
			((ch>='a' && ch<='z')?("lowwer case"):("upper case")):
			((ch>='1' && ch<='9')?
			("is digit"):("it is Special ch"));

		System.out.println(op);
	}
}
