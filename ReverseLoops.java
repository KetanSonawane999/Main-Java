import java.util.Scanner;
class ReverseLoops 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();	//initionation

		int rev = 0;
		int temp = num;

	/*	for ( ; num>0; num/=10 )
		{
			int rem = num%10;
			rev =rev*10 + rem;
			//num/=10;
		}
		System.out.println(rev +" : "+ temp);	*/

		while (num>0)	//condition
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num/=10;	// updation
		}
		System.out.println(rev);
	}
}
