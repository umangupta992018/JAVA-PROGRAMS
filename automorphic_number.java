import java.util.Scanner;
public class automorphic_number
{
       public static void main(String arg[])
       {
           int n,m,z,n1,d,c=0,i,pow=1;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter The Number:\n");
           n=sc.nextInt();
           n1=n;
           m=n*n;
           z=m;
           while(n1!=0)
           {
               d=n1%10;
               c++;
               n1=n1/10;
           }
           for(i=1;i<=c;i++)
           {
               pow=pow*10;
           }
           if((m%pow)==n)
           {
               System.out.println(n+" Is A Automorphic Number.\n");
           }
           else
           {
               System.out.println(n+" Is Not A Automorphic Number.\n");
           }
        }
}
