class ConditionalOp 
{
	public static void main(String[] args) 
	{
		// neasted Condtional Op.

		// largest among 2
		int a1 = 2;
		int b1 = 4;

		int large = (a1>b1)?(a1):(b1);
		System.out.println("Largest Number Among 2 Digits is : "+large);


		// Largest among 3 
		int a = 2;
		int b = 4500;
		int c = 1;


		//			   2>4    2>1             4>1
		int largest = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("Largest Number Among 3 Digits is : "+largest);

		//				 2<3    2<1			   5<8
		int smallest  = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("Smallest : "+smallest);


		// largest among the 4 
		int n1=4;
		int n2=30;
		int n3=7;
		int n4=9;

		//		   4 > 3    4 > 7         7 > 9
		int lar = (n1>n2)?((n1>n3)?(n1):((n3>n4)?(n3):(n4))):(n2);
		System.out.println("Largest Number Among 4 Digits is : "+lar);
		
	}
}
