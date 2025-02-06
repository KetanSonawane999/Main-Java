import java.util.Scanner;

class Rectangles
{
	public static void main(String[] args) 
	{

		final float pi = 22/7;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width : ");
		float width = sc.nextFloat();
		System.out.print("Enter height : ");
		float height = sc.nextFloat();

		// Area of Rectangle 
		float area = width * height;
		System.out.println("Area of Rectangle : s"+area);

		// Perimeter of Rectangle 
		float perimeter = 2*(height + width);
		System.out.println("Perimeter of Rectangle : "+perimeter);




	}
}
