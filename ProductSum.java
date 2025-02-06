class ProductSum 
{
	public static void main(String[] args) 
	{
		int num = 222;
		int rem;
		int Product = 1;

		System.out.println(num);

		rem = num % 10;		//3
		Product = Product *  rem;
		num = num/10;

		rem = num%10;
		Product = Product * rem;
		num = num/10;

		rem = num % 10;
		Product = Product * rem;
		num = num/10;

		System.out.println("Product of digit is : "+Product);

	}
}
