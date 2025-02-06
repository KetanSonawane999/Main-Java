import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{

		final float pi = 22/7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		float radius = sc.nextFloat();

		// Area of Circle
		float areaOfCircle = pi * radius * radius;
		System.out.println("Area of Circle  :  "+ areaOfCircle);

		// Perimeter of Circle
		float perimeter = 2 * pi * radius;
		System.out.println("Perimeter of Circle : "+ perimeter);
		 

	}
}
