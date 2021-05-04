
import java.util.*;
public class second_smallest_in_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int min=Integer.MAX_VALUE,second_min=Integer.MAX_VALUE;
        System.out.println("Enter The Size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n<2)
        {
            System.out.println("Invalid Input");
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]<min)
            {
                second_min=min;
                min=arr[j];
            }
        }
        for(int h=0;h<n;h++)
        {
            if(arr[h]<second_min&&arr[h]!=min)
            {
                second_min=arr[h];
            }
        }
        System.out.println(second_min);
    }
}
        