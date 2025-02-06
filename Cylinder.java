import java.util.Scanner;

class Cylinder 
{
	public static void main(String[] args) 
	{

		final float pi = 22/7;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius : ");
		float radius = sc.nextFloat();

		System.out.print("Enter Length : ");
		float length = sc.nextFloat();

		// area of cylinder 
		float area = pi * radius * radius;

		// volume of cylinder 
		float volume = area * length;
		   
		System.out.println("Area of Cylinder : "+ area);
		System.out.println("volume of Cylinder : "+ volume);
	}
}
