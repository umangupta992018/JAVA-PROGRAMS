import java.util.Scanner;
public class strong_number 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n,d,c=0,d1,i,sum=0;
        System.out.println("Enter The Number:\n");
        n=sc.nextInt();
        int t=n;
        int m=n;
        int z=n;
        while(m!=0)
        {
            d=m%10;
            c++;
            m=m/10;
        } 
        while(z!=0)
        {
           d1 = z%10;
           int fact=1;
           for(i=0;i<d1;i++)
           {
               fact = fact*(d1-i);
           }
           z/=10;
           sum=sum+fact;
        }
           if(sum==t)   
           {
            System.out.println(t+" Is A Strong Number.\n");
           }
           else
           {
           System.out.println(t+" Is Not A Strong Number.\n");
           }         
    }
}
