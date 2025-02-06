class SwapNumber 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 3;

		System.out.println("Before Swapping" );
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);



		// main logic for swapping the 2 vsriables
		a = a + b ;         // 1 + 3 = 4(a)
		b = a - b ;        // 4 - 3 = 1(b)
		a = a - b ;       // 4 - 1 = 3(a) 

		
		// a = 1 + 3 = 4
		// b = 4 - 3 = 1      b = 1
		// a = 4 - 1 = 3      a = 3

		System.out.println("After Swapping ");
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);


	}
}
