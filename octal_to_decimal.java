import java.util.Scanner;
public class octal_to_decimal 
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
        //int arr1[]=new int[c];
        for(i=0;i<c;i++)
        {
            d1=m%10;
            arr[i]=d1;
            m/=10;
        }
        /*for(i=c-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }*/
        for(i=c;i>=1;i--)
        {
            k=i;
            int pow=1;
            for(j=1;j<=k;j++)
            {
                pow=pow*8;
            }
            sum=sum+((pow/8)*(arr[i-1]));
            //System.out.print((arr[i-1])+"\n");
        }
        System.out.print("Octal Number "+m1+" In Decimal Number Is: "+sum+"\n");
    }
}
