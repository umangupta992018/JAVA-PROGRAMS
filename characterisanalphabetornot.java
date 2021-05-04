
import java.util.Scanner;
public class characterisanalphabetornot
{
    public static void main(String arg[])
    {
          Scanner sc = new Scanner(System.in);
          char c;
          System.out.println("\nEnter The Character:\n");
          c=sc.next().charAt(0);
          int i = c;
          if((i>=65&&i<=90)||(i>=97&&i<=122))
          {
              System .out.println("\nCharacter "+c+" is a Alphabet!.\n");
          }
          else
          {
              System.out.println("\nCharacter "+c+" is not a Alphabet!.\n");
          }
          //System.out.println(i);
          //field.forEach((a)) -> a.setText("");
    }
}
