
import java.util.*;
public class number_of_distinct_element_in_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter The Size Of The Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n==0||n==1)
        {
            n=n;
        }
        int temp[]=new int[n];
        int j=0,i;
        for(i=0;i<n-1;i++)
            if(arr[i]!=arr[i+1])
                temp[j++]=arr[i];
                temp[j++]=arr[n-1];
        
        for(i=0;i<j;i++)
        {
            arr[i]=temp[i];
        }
        n=j;
    for(int z=0;z<n;z++)
    {
        count++;
    }
    System.out.print("Total Number Of Distinct Element In The Array Is : "+count+"\n");
    }
}