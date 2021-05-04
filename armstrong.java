import java.util.Scanner;
public class armstrong 
{
   public static void main(String arg[])
   {
       Scanner sc = new Scanner(System.in);
       int n,d,c=0,m,i,sum=0,d1,m1;
       System.out.println("Enter The Number:\n");
       n=sc.nextInt();
       m=n;
       m1=n;
       while(n!=0)
       {
           d=n%10;
           c++;
           n/=10;
       } 
       while(m!=0)
       {
           d1 = m%10;
           int pow=1;
           for(i=1;i<=c;i++)
           {
               pow = pow*d1;
           }
           sum=sum+pow;
           m = m/10;
       }
       if(sum==m1)
       {
           System.out.println(m1+" Is A Armstrong Number.\n");
       }
       else
       {
           System.out.println(m1+" Is Not A Armstrong Number.\n");
       }
    }
}
