package mypack;
import java.util.Scanner;
public class sumofNnaturalnumbers 
{
    public static void main(String arg[])
    {
        int n,i,m,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N natural Number:\n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            m=sc.nextInt();
            sum=sum+m;
        }
        System.out.println("\nSum of "+n+" Natural Number is "+sum+".\n");
    }
}
