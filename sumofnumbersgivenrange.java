package mypack;
import java.util.Scanner;
public class sumofnumbersgivenrange
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n,range1,range2,m,i,sum=0;
        System.out.println("Enter the N Natural Number:");
        n=sc.nextInt();
        System.out.println("Enter the Range1 of a Number :");
        range1=sc.nextInt();
        System.out.println("Enter the Range2 of a Number :");
        range2=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            m=sc.nextInt();
            if((m>=range1)&&(m<=range2))
            {
              sum = sum + m;
            }
        }
        //System.out.println(sum);
        System.out.println("Sum of the "+n+" Natural Number in the given range from "+range1+" To "+range2+" is "+sum+".\n");
    }
}
