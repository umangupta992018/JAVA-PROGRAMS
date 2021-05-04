
import java.util.*;
public class string_in_alphabetical 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i,d=0,j,k,z,temp;
        System.out.print("Enter The String:");
        s=sc.nextLine();
        s=s.toLowerCase();
        l=s.length();
        int arr[]=new int[l];
        char c[]=s.toCharArray();
        
        for(i=0;i<l;i++)
        {
            d=c[i];
            arr[i]=d;
        }
        if((d>=97)&&(d<=122))
        {
        /*for(z=0;z<l;z++)
        {
            System.out.print(arr[z]+" ");
        } */
        System.out.println("\n");
        for(j=0;j<l;j++)
        {
           for(k=j+1;k<l;k++)
           {
              if(arr[j]>arr[k])
              {
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
              }
           }
        }
        System.out.print("String "+s+" In Alphabetical Order Is : ");
        for(z=0;z<l;z++)
        {
            System.out.print((char)arr[z]);
        }  
        }
    }
}
