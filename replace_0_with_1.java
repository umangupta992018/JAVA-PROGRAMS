import java.util.Scanner;
public class replace_0_with_1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,d,c=0,d1,g=0,k,o,rev=0;   
        System.out.println("Enter The Number:\n");
        n=sc.nextInt();
        m=n;
        int n1=m;
        while(n!=0)
        {
            d=n%10;
            c++;
            n/=10;
        }
        //System.out.println("\n\n"+c+"\n");
        int arr[]=new int[c];
        while(m!=0)
        {
            d1=m%10;
            o=g++;
            m=m/10;
            arr[o]=d1;
            //System.out.print(arr[o]+" ");
        }
        for(k=0;k<c;k++)
        {
            if(arr[k]==0)
            {
               arr[k]=1;
            }
        }
        System.out.print("\nReplace All 0 with 1 in a given integer "+n1+" Is : ");
        for(k=c-1;k>=0;k--)
        {
            System.out.print(arr[k]);
        }
        System.out.println(".\n"); 
    }
}
