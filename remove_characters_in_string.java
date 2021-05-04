
import java.util.*;
public class remove_characters_in_string 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s;
        int l,i,con;
        char ch;
        System.out.println("Enter The String:");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        l=s.length();
        System.out.print("Remove characters in a string"+s+" except alphabets is : ");
        for(i=0;i<l;i++)
        {
            con=c[i];
            if((con>65)&&(con<90)||(con>97)&&(con<122))
            {
                System.out.print((char)con);
            }
        }
        System.out.println();
    }
}
