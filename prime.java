import java.util.Scanner;
public class prime 
{
    public static void main(String arg[])
    {
           Scanner sc = new Scanner(System.in);
           int n,i,c=0;
           System.out.println("Enter the number:\n");
           n=sc.nextInt();
           for(i=1;i<=n;i++)
           {
               if(n%i==0)
               {
                   c++;
               }
               
           }
           if(c==2)
               {
                   System.out.println(n+" is a prime number.\n");
               }
               else
               {
                   System.out.println(n+" is not a prime number.\n");
               }
    }
}
