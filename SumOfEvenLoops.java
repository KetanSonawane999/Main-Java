import java.util.Scanner;
class SumOfEvenLoops 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number : ");
		int num = new Scanner(System.in).nextInt();

		int sum =0;
		int temp = num;

		/*while (num>0)
		{
			//int rem = num%10;
			//if (rem%2==0)

			if((num%10)%2==0)
				sum +=num%10;
			
			num/=10;	
		}
		System.out.println(sum);*/	

		for ( ;num>0 ;num/=10 )
			if ((num%10)%2==0)
				sum+=num%10;

		System.out.println(sum);
				
		
		
	}
}
