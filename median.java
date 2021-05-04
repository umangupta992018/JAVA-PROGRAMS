import java.util.Scanner;
public class median
{
    public static void main(String arg[])
    {
        int n,i,j,m,m1,m2,m3,m4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Length:\n");
        n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("\nEnter The Array Elements:\n");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=arr.length;
        System.out.println("\nArray Elements Are:");
        for(j=0;j<l;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\n\n");
        int i1,j1,temp;
        for(i1=0;i1<l;i1++)
        {
            for(j1=i1+1;j1<l;j1++)
            {
                if(arr[j1]<arr[i1])
                {
                    temp=arr[i1];
                    arr[i1]=arr[j1];
                    arr[j1]=temp;
                }
            }
        }
        /*for(int z=0;z<l;z++)
        {
            System.out.print(arr[z]+" ");
        }*/
        
        if((l%2)==0)
        {
             m2=((((l/2)+1))-2);
             m3=((l/2));
             m4=(arr[m2]+arr[m3])/2;
             System.out.println("\nThe median value of this set of numbers is "+m4+".");
        }
     
        if((l%2)!=0)
        {
            m3=((((l+1)/2))-1);
            m1=(arr[m3]);
            System.out.println("\nThe median value of this set of numbers is "+m1+".");
        }
      
    }
}
