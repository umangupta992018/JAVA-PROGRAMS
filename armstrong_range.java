import java.util.Scanner;
public class armstrong_range 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int min,max,x,a,c1=0,c2=0,d,j,p=1,sum=0;
        System.out.println("Enter The Minimum Limit:");
        min=sc.nextInt();
        System.out.println("Enter The Maximum Limit:");
        max=sc.nextInt();
        System.out.print("Armstrong Numbers from "+min+" to "+max+" is:- ");
        for(int i=min;i<=max;i++)
        {
            x=i;
            while(x!=0)
            {
                a=x%10;
                c1=c1+1;
                x=x/10;
            }
            c2=c1;
            x=i;
            while(x!=0)
            {
                d=x%10;
                for(j=1;j<=c2;j++)
                {
                    p=p*d;
                }
                x=x/10;
                sum=sum+p;
                p=1;
            }
            if(sum==i)
            {
                System.out.print(sum+" ");
            }
            sum=0;
            p=1;
            c1=0;
        }
        System.out.print("\n");
    }
}
