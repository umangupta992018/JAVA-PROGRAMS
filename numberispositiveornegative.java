
import java.util.Scanner;
public class numberispositiveornegative
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:\n");
        int n = sc.nextInt();
        if(n>=0)
        {
            System.out.println(n+" is a Positive Number.\n");
        }
        if(n<0)
        {
            System.out.println(n+" is a Negative Number.\n");
        }
    }
}
