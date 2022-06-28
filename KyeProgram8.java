import java.util.*;
class KyeProgram8
{
	public static void main(String [] args)
	{
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//create variables for x1,2 and y1, 2
		System.out.println("Enter your x1 coordinate.");
		int x1 = input.nextInt();
		System.out.println("Enter your y1 coordinate.");
		int y1 = input.nextInt();
		System.out.println("Enter your x2 coordinate.");
		int x2 = input.nextInt();
		System.out.println("Enter your y2 coordinate.");
		int y2 = input.nextInt();
		
		//create formula to calculate distance 
		double distance = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2));
		
		System.out.println("The distance between the two points are: " + distance);
		
	}
}