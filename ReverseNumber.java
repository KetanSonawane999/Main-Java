class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int temp = num;
		int rev = 0;

		// 1st 
		int rem = num%10;        //1	to get reminder of num   
		rev = rev * 10 +rem;     //2	
		num = num/10;            //3

		// 2nd 
		rem = num%10;
		rev = rev * 10 + rem;
		num = num/10;

		// 3rd 
		rem = num%10;
		rev = rev * 10 + rem;
		num = num/10;

		// 4th
		rem = num%10;
		rev = rev * 10 + rem;
		num = num/10;	



	/*	for (int i = 0; i<=num; i++)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;

		}	*/


		System.out.println(temp+" : "+rev);

	}
}
