
import java.util.*;
public class check_two_array_are_same_or_not 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,i,j,count=0;
        System.out.print("Enter The size of the Array-1 : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("\n\nEnter the size of the Array-2 : ");
        m=sc.nextInt();
        int arr1[]=new int[m];
        for(i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        if(n==m)
        for(i=0;i<n;i++)
        {
           if(arr[i]==arr1[i])
                {
                    count++;
                }
        }
        if(n!=m)
            System.out.println("Not Equal");
        if((count==n)&&(count==m))
        {
            System.out.print("YES,it is Equal");
        }
        else
        {
            System.out.print("NOt Equal");
        }
    }
}

