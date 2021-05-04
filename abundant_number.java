import java.util.Scanner;
public class abundant_number 
{
       public static void main(String arg[])
       {
           int n,m=0;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter The Number:\n");
           n=sc.nextInt();
           for(int i=1;i<n;i++)
           {
            if(n%i==0)
            {
                m=m+i;
            }
           }
           if(m>n)
           {
               System.out.println(n+" Is A Abundant Number.\n");
           }
           else
           {
               System.out.println(n+" Is Not A Abundant Number.\n");
           }
       }
}
