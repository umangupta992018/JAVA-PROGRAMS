
import java.util.Scanner;
public class numberisevenorodd
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:\n");
        int n = sc.nextInt();
        if((n%2)==0)
        {
            System.out.println(n+" is a even number.\n");
        }
        if((n%2)!=0)
        {
            System.out.println(n+" is a odd number.\n");
        }
    }
}
