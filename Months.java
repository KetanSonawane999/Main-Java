import java.util.Scanner;
class Months 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 char of months : ");
		String month = sc.next().toUpperCase();

		String op = (month.equals("OCT") || month.equals("NOV") || month.equals("DEC")|| month.equals("JAN"))?("Winter"):
			((month.equals("FEB") || month.equals("MAR") || month.equals("APR")|| month.equals("MAY"))?("Summer"):
			((month.equals("JUN") || month.equals("JUL") || month.equals("AUG") || month.equals("SEP"))?("Mansoon"):("Invalid")));

		System.out.println(op);
	}
}
