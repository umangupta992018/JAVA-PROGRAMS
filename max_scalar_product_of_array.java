import java.util.*;
public class max_scalar_product_of_array
{
	public static void main(String args[])
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of The Array-1 : ");
		int n1=sc.nextInt();
		int arr1[] = new int[n1];
		System.out.print("\n\nEnter The Size Of The Array-2 : ");
		int n2=sc.nextInt();
		int arr2[] = new int[n2];
		System.out.print("\n\nEnter The Value Of The Array-1 : ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("\n\nEnter The Value Of The Array-2 : ");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(arr2[i]>arr2[j])
				{
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		int sum=0;
		int prod[]=new int[n1];
		if(n1==n2)
		{
		for(int i=0;i<n1;i++)
		{
			prod[i]=arr1[i]*arr2[i];
			sum+=prod[i];
		}
		}
		System.out.println(sum);
	}
}
