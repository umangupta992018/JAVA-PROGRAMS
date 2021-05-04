
import java.util.*;
public class smallest_largest_in_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,greatest=0,smallest=0,i;
        System.out.print("\nEnter The Size Of The Array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            greatest=arr[j];
            for(i=0;i<n;i++)
            {
                if(arr[i]>greatest)
                {
                    greatest=arr[i];
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            smallest=arr[j];
            for(i=0;i<n;i++)
            {
                if(arr[i]<smallest)
                {
                    smallest=arr[i];
                }
            }
        }
        System.out.print("Smallest Element In The Array Is : "+smallest);
        System.out.print("\n\nLargest Element In The Array Is : "+greatest+"\n");
    }
}
