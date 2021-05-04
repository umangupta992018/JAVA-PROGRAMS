
import java.util.*;
public class removing_brackets_inString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l,i,d;
        String s;
        System.out.print("Enter The String : ");
        s=sc.nextLine();
        char c[] = s.toCharArray();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if((c[i]=='(')||(c[i]==')')||(c[i]=='{')||(c[i]=='}')||(c[i]=='[')||(c[i]==']'))
            {
                c[i]='\0';
            }
        }
        System.out.print("String "+s+" After Removing {,},(,),[,] Brackets Is : ");
        for(i=0;i<l;i++)
        {
            System.out.print(c[i]);
        }
    }
}