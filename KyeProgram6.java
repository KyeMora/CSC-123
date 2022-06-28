import java.util.Scanner;
class KyeProgram6
{
	public static void main(String [] args)
	{
		int odd = 0, even = 0, zero = 0;
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter an integer value: ");
		String userInt = input.next();
		
		for (int i = 0; i <userInt.length(); i++)
		{
			char k = userInt.charAt(i);
			int num = Integer.parseInt(Character.toString(k));
			if (num == 0)
			{
				zero++;
				even++;
			}
			else if ((num % 2) == 0)
			{
				even++;
			}
			else 
			{
				odd++;
			}
		}
		System.out.println(even + " even digits");
		System.out.println(odd + " odd digits");
		System.out.println(zero + " zero digits");
	}
}