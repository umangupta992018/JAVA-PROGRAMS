import java.util.Scanner;
public class binary_to_octal 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,d = 0,c=0,i,m,m1,d1,sum=0,j,k=0;
        System.out.println("Enter The Binary Number:");
        n=sc.nextInt();
        m=n;
        m1=n;
        while(n!=0)
        {
           d=n%10;
           c++;
           n=n/10;
        }
        int arr[]=new int[c];
        for(i=0;i<c;i++)
        {
            d1=m%10;
            arr[i]=d1;
            m/=10;
        }
        for(i=c;i>=1;i--)
        {
            k=i;
            int pow=1;
            for(j=1;j<=k;j++)
            {
                pow=pow*2;
            }
            sum=sum+((pow/2)*(arr[i-1]));
        }
        int x,x1,x11,x111=0,x1111,x11111;
        x=sum;
        x1=x;
        while(x!=0)
        {
            x11=x%10;
            x111++;
            x=x/10;
        }
        int a[]=new int[x111];
        System.out.print("Converting Binary Number "+m1+" To Octal Number is: ");
        for(x1111=0;x1111<x111;x1111++)
        {
            a[x1111]=x1%8;
            x1=x1/8;
            if(x1==0)
            {
                for(x11111=x111-1;x11111>=0;x11111--)
                {
                    System.out.print(a[x11111]);
                }
            }
        }
        System.out.print("\n");
    }
}