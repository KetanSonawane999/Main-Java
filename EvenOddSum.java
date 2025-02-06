class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 3322;
		System.out.println(num);

		int evenSum = 1;
		int oddSum = 1;

		int rem , sum;

		// sum of even odd

	/*	rem = num % 10;    // for extract last digit = 4th
		int sum = (num%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);
		num = num/10;
 
		rem = num % 10;    // for extract 2nd last digit = 3rd 
		sum = (num%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);
		num = num/10;

		rem = num % 10;    // for extract 3rd last digit = 2nd
		sum = (num%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);
		num = num/10;

		rem = num % 10;    // for extract 1st last digit = 1st
		sum = (num%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);
		num = num/10;
		*/

		

		// product of even odd

		rem = num % 10;    // for extract last digit = 4th
		sum = (num%2==0)?(evenSum = evenSum * rem):(oddSum = evenSum * rem);
		num = num/10;
 
		rem = num % 10;    // for extract 2nd last digit = 3rd 
		sum = (num%2==0)?(evenSum = evenSum * rem):(oddSum = oddSum * rem);
		num = num/10;

		rem = num % 10;    // for extract 3rd last digit = 2nd
		sum = (num%2==0)?(evenSum = evenSum * rem):(oddSum = oddSum * rem);
		num = num/10;

		rem = num % 10;    // for extract 1st last digit = 1st
		sum = (num%2==0)?(evenSum = evenSum * rem):(oddSum = oddSum * rem);
		num = num/10;


		System.out.println("Product of even : "+evenSum);
		System.out.println("Product of odd : "+oddSum);
		System.out.println(sum);

		
		//evenSum = evenSum + (rem%2!=0);
		//oddSum = oddSum + (rem%2!=0);
		

	/*	rem = num % 10;
		rem = num%2==0;
		evenSum= evenSum + rem;
		num = num/10;

		rem = num % 10;
		rem = num%2==0;
		evenSum= evenSum + rem;
		num = num/10;

		rem = num % 10;
		rem = num%2==0;
		evenSum= evenSum + rem;
		num = num/10;	*/


		
	}
}
