
import java.util.*;
public class longest_pallindome_in_array 
{
    public static void main(String args[])
    {
        int rev=0,d,m,count=0,greatest=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int array[]=new int[n];
        int array1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            m=arr[j];
            rev=0;
            while(m!=0)
            {
                d=(m%10);
                rev=((rev*10)+d);
                m/=10;
            }
            if(rev==arr[j])
            {
                array[count]=rev;
                //System.out.print(array[count]+" ");
                count++;
            }}
            for(int k=0;k<count;k++)
            {
                //System.out.print(array[k]+" ");
                //if(rev==arr[j])
                //{
                    //array[k]=rev;
                    //System.out.println(array[k]+" ");
                //}
            } 
        
        //for(int k=0;k<count;k++)
        //{
         //   System.out.println(array1[k]+" ");
        //}
        
    
for(int l=0;l<count;l++)
        {
            greatest=array[l];
            for(int y=0;y<count;y++)
            {
                if(array[y]>greatest)
                {
                    greatest=array[y];
                }
            }
        }System.out.print("Longest Pallindrome In An Array Is : "+greatest);}}
    
//}
/*package mypack;
import java.util.Scanner;
public class p91
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter no. of elements you want in array:");
     int n = sc.nextInt();
     int a[] = new int[n+1];
     System.out.println("Enter all the elements:");
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     if(n==0||n==1)
        n=n;
     int temp[]=new int[n];
     int j=0;
     int i;
     for(i=0;i<n-1;i++)
         if(a[i]!=a[i+1])
             temp[j++]=a[i];
             temp[j++]=a[n-1];
    for(i=0;i<j;i++)
        a[i]=temp[i];
    n=j;
    //System.out.print(j+ " ");
    
    for(int z=0;z<n;z++)
       System.out.print(a[z] + " ");

    }
}*/
