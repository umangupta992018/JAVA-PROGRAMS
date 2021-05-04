import java.util.Scanner;
public class decimal_to_octal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,d,c=0,m=0,i,j=0;
        System.out.print("Enter The Number: ");
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        int arr[]=new int[c];
        System.out.print("Converting Decimal Number "+m+" To Octal Number is: ");
        for(i=0;i<c;i++)
        {
            arr[i]=m%8;
            m=m/8;
            if(m==0)
            {
                for(j=c-1;j>=0;j--)
                {
                    System.out.print(arr[j]);
                }
            }
        }
        System.out.print("\n");
    }
}