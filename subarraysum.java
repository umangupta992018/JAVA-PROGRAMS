import java.util.*;
public class subarraysum
{
	public static int subarraySum(int arr[],int n,int sum)
	{
		int curr_sum,i,j;
		for(i=0;i<n;i++)
		{
			curr_sum=arr[i];
			for(j=i+1;j<=n;j++)
			{
				if(curr_sum==sum)
				{
					System.out.println(i+" "+(j-1));
					return 1;
				}
				if(curr_sum>sum||j==n)
				{
					break;	
				}
				curr_sum=curr_sum+arr[j];
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int i;
		int sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of The Array : ");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		for(i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter The Sum");
		sum1=sc.nextInt();
		
		subarraySum(arr1,n1,sum1);
	}
		
	}

