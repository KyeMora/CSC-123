import java.util.Scanner;
class KyeProgram3
{
  public static void main(String[] args) 
  {
    int totalSeconds, hr, min, sec;

    //create scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of seconds. ");
    totalSeconds = input.nextInt();

    //convert seconds to its respective time
    hr = (totalSeconds / 3600);
    min = (totalSeconds / 60) - (hr * 60);
    sec = (totalSeconds - min * 60) - (hr * 3600);

    System.out.println(hr + " Hours, " + min + " Minutes, " + sec + " Seconds");
  }
}