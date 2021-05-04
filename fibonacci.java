import java.util.Scanner;
public class fibonacci 
{
    public static void main(String arg[])
    {
           Scanner sc = new Scanner(System.in);
           int a=0,b=1,n,c,i;
           System.out.println("\nEnter The Limit Of The Fibonacci Series:\n");
           n=sc.nextInt();
           System.out.print(a+"");
           System.out.print(" "+b);
           for(i=2;i<=n;i++)
           {
               c=a+b;
               System.out.print(" "+c);
               a=b;
               b=c;
           }
           System.out.println("\n");
    }
}
