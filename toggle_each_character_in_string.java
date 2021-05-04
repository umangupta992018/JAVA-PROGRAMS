
import java.util.*;
public class toggle_each_character_in_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i,count=0,d=0,d1=0;
        System.out.println("Enter The  String:");
        s=sc.nextLine();
        char arr[]=s.toCharArray();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if((arr[i]>='A')&&(arr[i]<='Z'))
            {
                d=arr[i]+32;
                arr[i]=(char)(d);
            }
            else if((arr[i]>='a')&&(arr[i]<='z'))
            {
                d1=arr[i]-32;
                arr[i]=(char)(d1);
            }
        }
        System.out.print("Toggle Each Character In A String "+s+" Is : ");
        for(int j=0;j<l;j++)
        {
            System.out.print(arr[j]);
        }
        System.out.print("\n\n");
    }
}
