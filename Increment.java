class Increment 
{
	public static void main(String[] args) 
	{
		int a = 10;
		a = ++a + a++;
		System.out.println(a);	//22

		int b = 10;
		b = b++;
		System.out.println(b);	//10

		int c = 10;
		c = c--;
		System.out.println(c);	//10

		a = a++;   // 22
		++a;	  // 23
		System.out.println(a);
	}
}
