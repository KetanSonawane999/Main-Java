class AlphabetSeries 
{
	public static void main(String[] args) 
	{
		int a = 1;
		for (char ch='A'; ch<='Z' ; ch+=a)
		{
			System.out.println(ch);
			a++;      // increment it so the value of a get incremented it +1 by its last value
			
		}
	
	}
}
