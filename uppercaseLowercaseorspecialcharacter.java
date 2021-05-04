import java.util.Scanner;
public class uppercaseLowercaseorspecialcharacter
{
    public static void main(String arg[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Character:\n");
    char ch;
    ch=sc.next().charAt(0);
    int n = ch;
    if((n>=65)&&(n<=90))
    {
      System.out.println("Character "+ch+" Is In Uppercase.\n");
    }
    else if((n>=97)&&(n<=122))
    {
      System.out.println("Character "+ch+" Is In Lowercase.\n");
    }
    else
    {
      System.out.println("Character "+ch+" Is A Special Character.\n");
    }
    }
}
