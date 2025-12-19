import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("input.txt");  // this is your problem input as a File object
    Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object

    int counter = 0;
    int currentNumber = 50;
    while (sc.hasNextLine())  // as long as the Scanner has more lines to read from the file...
    {
      String line = sc.nextLine();  // gets the next line of input.  This is like "R802"
      int x = Integer.parseInt(line.substring(1));
      String direction = line.substring(0, 1);

      if(direction.equals("L"))
      {
        x *= -1;
      }

      currentNumber += x;

      currentNumber = ((currentNumber % 100) + 100) % 100;

      if(currentNumber == 0)
      {
        counter++;
      }

      //System.out.println("The current number is " + currentNumber +"\n");
    }

    System.out.println("The password is " + counter);
    sc.close();
  }
}
