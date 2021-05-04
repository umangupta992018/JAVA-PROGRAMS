
import java.util.*;
public class pallindrome_string 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        String add="";
        boolean b;
        int l,i,j,c=0;
        System.out.print("Enter The String:");
        s=sc.nextLine();
        char arr[]=s.toCharArray();
        char arr1[]=s.toCharArray();
        l=s.length();
        for(i=l-1;i>-1;i--,c++)
        {
          arr1[c]=arr[i];
        }
        for(i=0;i<l;i++)
        {
          add=add+arr1[i];
        }
        if((s.equals(add)==true))
        {
            System.out.print(s+" Is A Pallindrome String.");
        }
        if((s.equals(add)==false))
        {
            System.out.print(s+" Is Not A Pallindrome String.");
        }
    }
}
