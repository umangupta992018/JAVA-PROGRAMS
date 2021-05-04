
import java.util.*;
public class insert_delete_search_in_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean y;
        System.out.print("Enter The Size Of Array : ");
        int n=sc.nextInt();
        int array[]=new int[100];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.print("\n\nArray Elements Are : ");
        for(int j=0;j<n;j++)
        {
            System.out.print(array[j]+" ");
        }
        System.out.print("\nEnter The Position Of the array where the elemnt is to be inserted : ");
        int pos=sc.nextInt();
        System.out.print("\nEnter The Value of Inserted Element : ");
        int insert=sc.nextInt();
        if(pos>n)
        {
            System.out.println("Array Size Out of Bound.");
        }
        if(pos<=n)
        {
        for(int z=n-1;z>=pos-1;z--)
        {
            array[z+1]=array[z];
        }
        array[pos-1]=insert;
        System.out.println("The New Array Formed Is : ");
        for(int j=0;j<=n;j++)
        {
            System.out.print(array[j]+" ");
        }
        }
        System.out.print("\nEnter the position of the array for deletion : ");
        int dpos=sc.nextInt();
        int t=dpos;
        for(int i=t-1;i<=n-1;i++)
        {
            array[i]=array[i+1];
        }
        n--;
        System.out.println("The New Array Formed Is After Deletion : ");  
        for(int j=0;j<=n;j++)
        {
            System.out.print(array[j]+" ");
        }
        System.out.print("\n\nEnter The Element Of The Array Which Is To Be Searched : ");
        int search=sc.nextInt();
        for(int k=0;k<=n;k++)
        {
            if(array[k]==search)
            {
                y=true;
            }
        }
        for(int k=0;k<=n;k++)
        {
            if(array[k]!=search)
            {
                y=false;
            }
        }
        if(y=true)
        {
            System.out.print(search+" Is Present In The Array");
        }
        if(y=false)
        {
            System.out.print(search+" Is Not Present In The Array");
        }
    }
}
