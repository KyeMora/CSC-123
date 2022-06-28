import java.util.Scanner;
class KyeProgram4
{
	public static void main(String [] args)
	{
		int numerator, denominator;
		double decimalEquiv;
	//take input as int
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a numerator");
		numerator = input.nextInt();
		
		System.out.println("Enter a denominator");
		denominator = input.nextInt();
		
	//cast ints to double
		decimalEquiv = (double)(numerator)/(denominator);

		System.out.println("The decimal equivlent of the fraction is " + decimalEquiv);
	}
}