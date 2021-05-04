
import java.util.*;
public class basic_string_operations 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String string,string1,string2,x;
        int n;
        char ch;
        System.out.print("Enter The String:");
        string=sc.nextLine();
        System.out.print("Enter The String:");
        string1=sc.nextLine();
        ch=string1.charAt(2);
        System.out.println(string.toUpperCase());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("where"));
        System.out.println("\n\nEnter The String:\n");
        String s=sc.next();
        System.out.println("\n\nEnter The String:");
        String s1=sc.nextLine();
        x="UMANG ";
        x=x.concat("GUPTA");
        System.out.println(x);
        String d1="  saurav";
        String d2="Saurav";
        System.out.println(d1.equals(d2));
        System.out.println(d1.equalsIgnoreCase(d2));
        System.out.println(d1.compareTo(s1));
        String s3=d1+d2+90;
        System.out.println(s3.substring(0, 3));
        System.out.println(d1.trim());
    }
}
