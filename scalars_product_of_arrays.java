import java.util.*;
public class scalars_product_of_arrays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i=0,j=0,temp;
		System.out.print("Enter The Size Of The Array-1 : ");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.print("Enter The Size Of The Array-2 : ");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("\n\nEnter The Value Of The Array-1 ");
		for(i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<n1;i++)
		{
			for(j=i+1;j<n1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println("\n\n\n\nEnter The Value Of The Array-1 ");
		for(i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<n1;i++)
		{
			for(j=i+1;j<n1;j++)
			{
				if(arr2[i]<arr2[j])
				{
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		int prod[]=new int[n1];
		int sum=0;
		if(n1==n2)
		{
			for(i=0;i<n1;i++)
			{
				prod[i]=arr1[i]*arr2[i];
				sum+=prod[i];
			}
		}
		if(n1!=n2)
		{
			System.out.println("Minimum Scalar Product Not Possible.\n");
		}
		System.out.print(sum);
	}
}
