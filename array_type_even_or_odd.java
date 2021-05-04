
import java.util.*;
public class array_type_even_or_odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,even=0,odd=0;
        System.out.print("Enter The Size Of The Array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]%2==0)
            {
                even++;
            }
            if(arr[j]%2==1)
            {
                odd++;
            }
        }
        if(n==even)
        {
            System.out.println("\nArray Type Is Even.");
        }
        else if(n==odd)
        {
            System.out.println("\nArray Type Is Odd.");
        }
        else
        {
            System.out.println("\nArray type Is Mixed.");
        }
    }
}
