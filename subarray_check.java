import java.util.*;
public class subarray_check 
{
	public static boolean subarraycheck(int arr1[],int n1,int arr[],int n)
	{
		int i=0,j=0;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
				if(arr[i]==arr1[j])
				{
					break;
				}
				}
				if(j==n1)
					return false;
			}
			return true;
	}
			
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Size Of The Array : ");
	int n2=sc.nextInt();
	int arr[]=new int[n2];
	System.out.println("\n\nArray Elements Are : ");
	for(int i=0;i<n2;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter The Size Of The SubArray : ");
	int n3=sc.nextInt();
	int arr1[]=new int[n3];
	for(int j=0;j<n3;j++)
	{
		arr1[j]=sc.nextInt();
	}
	if(n3<=n2)
	{
	if(subarraycheck(arr,n2,arr1,n3))
	{
		System.out.println("Yes SubArray");
	}
	else
	{
		System.out.println("No SubArray");
	}
	}}
}


