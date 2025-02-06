class Program1
{
	public static void main (String [] args)
	{
		(ch>='A' && ch<='Z' || ch>=97 && ch<=122)?
			((ch>='a' && ch<='z')?(ch + " is lower case"):(ch + " is uppercase")):
			((ch>='0' && ch<='9')?(ch +" Digit"):
			(ch+" Special Character"));
  	}
}	