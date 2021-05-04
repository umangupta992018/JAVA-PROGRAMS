/*Octal to binary conversion*/
import java.util.Scanner;
public class octal_to_binary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,d,c=0,i,m,m1,d1,sum=0,j,k=0;
        System.out.println("Enter The Octal Number:");
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
                pow=pow*8;
            }
            sum=sum+((pow/8)*(arr[i-1]));
        }
        //System.out.print("Octal Number "+m1+" In Decimal Number Is: "+sum+"\n");

        int x,x1,x11,x111,x1111=0,j11=0,c1=-1;
        x=sum;
        x1=x;
        x11=x;
        while(x!=0)
        {
            x111=x%10;
            x1111++;
            x=x/10;
        }
        int a[]=new int[100];
        while(x1!=0)
        {
          c1++;
          a[c1]=x1;
          x1=x1/2; 
          //arr[c1]=arr[c1]%2;
        }
        System.out.print("Converting Octal Number "+m1+" To Binary Number is: ");
        for(j11=c1;j11>=0;j11--)
        {
            System.out.print(a[j11]%2);
        }
        System.out.println();
    }      
}

