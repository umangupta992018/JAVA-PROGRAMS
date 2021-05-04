import java.util.*;
public class check_anagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        int l1,l2,m,i=0,j=0,a,b,temp,count=0;
        System.out.print("Enter The 1st String:");
        s1=sc.nextLine();
        s1=s1.toUpperCase();
        System.out.print("Enter The 2nd String:");
        s2=sc.nextLine();
        s2=s2.toUpperCase();
        l1=s1.length();
        l2=s2.length();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int arr[]=new int[l1];
        int arr1[]=new int[l2];
        for(i=0;i<l1;i++)
        {
            int d=c1[i];
            arr[i]=d;
        }
        for(a=0;a<l1;a++) 
        {
            for(b=a+1;b<l1;b++) 
            {
                if(arr[a]>arr[b]) 
                {
                    temp=arr[a];
                    arr[a]=arr[b];
                    arr[b]=temp;
                }
            }
        }
        for(i=0;i<l2;i++)
        {
            int d=c2[i];
            arr1[i]=d;
        }
        for(a=0;a<l2;a++) 
        {
            for(b=a+1;b<l2;b++) 
            {
                if(arr1[a]>arr1[b]) 
                {
                    temp=arr1[a];
                    arr1[a]=arr1[b];
                    arr1[b]=temp;
                }
            }
        }
        m=l1=l2;
        if(m>0)
        {
        for(i=0;i<m;i++)
        {
            if(arr[i]==arr1[i])
            {
                count++;
            }
        }
        if(count==m)
        {
            System.out.print("\n\n"+s1+" and "+s2+" Are Anagram.");
        }
        else
        {
            System.out.print("\n\n"+s1+" and "+s2+" Are not Anagram.");
        }
        }
        if(l1!=l2)
        {
        System.out.println("ANAGRAM IS NOT POSSIBLE BETWEEN STRINGS "+s1+" and "+s2);
        }
    }  
}
