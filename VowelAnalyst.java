import java.util.Scanner;
public class VowelAnalyst
{
	public static void main(String[] args)
	{
		int aCounter, eCounter, iCounter, oCounter, uCounter, otherCounter;
		String str;
		char ch;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		str = input.nextLine();
		aCounter = 0;
		eCounter = 0;
		iCounter = 0;
		oCounter = 0;
		uCounter = 0;
		otherCounter = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(ch == 'a')
			{
				aCounter++;
			}
			else if(ch == 'e')
			{
				eCounter++;
			}
			else if(ch == 'i')
			{
				iCounter++;
			}
			else if(ch == 'o')
			{
				oCounter++;
			}
			else if(ch == 'u')
			{
				uCounter++;
			}
			else if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			{
				otherCounter++;
			}
		}
		
		System.out.println("a: "+ aCounter);
		System.out.println("e: "+ eCounter);
		System.out.println("i: "+ iCounter);
		System.out.println("o: "+ oCounter);
		System.out.println("u: "+ uCounter);
		System.out.println("other: "+ otherCounter);
	}
}