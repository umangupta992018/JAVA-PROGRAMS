import java.util.*;
public class disjoint_array 
{
	public static int equal(int arrr[],int n4,int arrr1[],int n3)
	{
		int i,j;
		for(i=0;i<n4;i++)
		{
			for(j=0;j<n3;j++)
			{
				if(arrr[i]==arrr1[j])
				{
					return 1;
				}}}
		for(i=0;i<n4;i++)
		{
			for(j=0;j<n3;j++)
			{
				if(arrr[i]!=arrr1[j])
				{
					return -1;
				}
			}
		}
		return 0;
	};
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array-1 : ");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter The Array-1 Elements : ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter The Size Of The Array-2 : ");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter The Array-2 Elements : ");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		if(equal(arr1,n1,arr2,n2)==-1)
		{
			System.out.println("Yes It is a Disjoint Array");
		}
		if(equal(arr1,n1,arr2,n2)==1)
		{
			System.out.println("No It is Not a Disjoint Array");
		}
	}
}
