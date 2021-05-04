import java.util.Scanner;
public class asciivaluesofacharacter
{
    public static void main(String arg[])
    {
          Scanner sc = new Scanner(System.in);
          char c;
          System.out.println("\nEnter The Character:\n");
          c=sc.next().charAt(0);
          int i = c;
          System.out.println("ASCII Value Of The Character "+c+" Is "+i+".\n");
    }
}
