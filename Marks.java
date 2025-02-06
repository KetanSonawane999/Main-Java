import java.util.Scanner;

class Marks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks : ");
		float marks = sc.nextFloat();

			
			marks = (marks / 600)*100;
		//marks/=600*100;
		//marks *=100;

		String op = /*(marks>=35)?((marks>=100 && marks<=75)?("garde A"):
			((marks>=75 && marks<=60)?("grade B"):((marks>=60 && marks<=35)?("grade c "):("fail")))):("fail");*/

			(marks>=75)?("grade A"):((marks>=60)?("garde b"):((marks>=35)?("garde c"):("Fail")));

		/*(marks>=75)?("grade a"):((marks>=60)?("grade b"):
			((marks>=35)?("grade c"):("fail")));*/

		System.out.println(marks+"%");
		System.out.println(op);
		

		
		System.out.println("invalid marks");
		
	}
}
