
import java.util.*;
public class remove_space_in_string 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i;
        System.out.println("Enter The String:");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(c[i]==' ')
            {
                c[i]='\0';
            }
        }
        System.out.print("Remove spaces from a string "+s+" is : ");
        for(i=0;i<l;i++)
        {
            System.out.print(c[i]);
        }
    }
}
