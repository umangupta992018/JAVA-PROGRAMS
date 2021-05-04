import java.util.*;
public class array_element_frequency 
{
	public static void main(String args[])
	{
		int c=0,j,i,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr3[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements  frequency");
		for(i=0;i<n;i++)
		{
			int k=arr[i];
			for(j=0;j<n;j++)
			{
				if(arr[j]==k)
				{
					c++;
				}	
			}
			System.out.println(arr[i]+"               "+c);
			arr1[i]=c;
			c=0;
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr1[i]);
		}
	}
}
