import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class KyeProgram5
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Name of file to compare: ");
		String file1 = scan.nextLine();
		System.out.print("name of file to compare: ");
		String file2 = scan.nextLine();

		FileReader fr = new FileReader(file1 + ".txt");
		BufferedReader bufr = new BufferedReader(fr);
		FileReader fr2 = new FileReader(file2 + ".txt");
		BufferedReader bufr2 = new BufferedReader(fr2);
		String line1 = bufr.readLine();
		String line2 = bufr2.readLine();
		int count = 1;
		
		while (line1 != null || line2 != null) 
		{
			if (line1 == null) 	
			{
				line1 = "null";
			}
			else if(line2 == null) 
			{
				line2 = "null";
			}
			if (!line1.equals(line2)) 
			{
				System.out.println(count + ":");
				System.out.println(line1);
				System.out.println(line2);
			}
			line1 = bufr.readLine();
			line2 = bufr2.readLine();
			count++;
		}
		
		bufr.close();
		bufr2.close();
		scan.close();

	}

}