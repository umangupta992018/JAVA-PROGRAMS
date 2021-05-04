import java.util.Scanner;
public class decimal_to_binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0,j=0,m,c1=-1,m1;
        System.out.print("Enter The Number:");
        n=sc.nextInt();
        m=n;
        m1=n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        int arr[]=new int[100];
        while(m!=0)
        {
          c1++;
          arr[c1]=m;
          m=m/2; 
          //arr[c1]=arr[c1]%2;
        }
        System.out.print("Converting Decimal Number "+m1+" To Binary Number is: ");
        for(j=c1;j>=0;j--)
        {
            System.out.print(arr[j]%2);
        }
        System.out.println();
    }      
}

