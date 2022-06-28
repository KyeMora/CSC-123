import java.util.*;
import java.text.DecimalFormat;
class KyeProgram9
{
	public static void main(String [] args)
	{
		//create variables and scanner
		double area, a , b , c, s;
		Scanner input = new Scanner(System.in);
		
		//take in sides into variables
		System.out.println("Enter length of side a.");
		a = input.nextDouble();
		System.out.println("Enter length of side b.");
		b = input.nextDouble();
		System.out.println("Enter length of side c.");
		c = input.nextDouble();
		
		//calculate variable s, and area
		s = (a + b + c) / 2;
		area = Math.sqrt((s*(s-a))*(s-b)*(s-c));
		
		/*
		//another way of rounding
		DecimalFormat df = new DecimalFormat("0.000");
		String formatted = df.format(area);
		System.out.println("The area is: " + formatted);
		*/
		
		System.out.printf("The area is: %.3f \n",area);
	}
}