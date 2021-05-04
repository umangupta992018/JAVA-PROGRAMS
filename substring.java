
import java.util.*;
public class substring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s,sreplace,snew;
        int l,i,count=0;
        System.out.print("Enter The String : ");
        s=sc.nextLine();
        System.out.print("Enter The String To Be Replaced : ");
        sreplace=sc.nextLine();
        System.out.print("Enter The New String : ");
        snew=sc.nextLine();
        char c[]=s.toCharArray();
        System.out.println(s);
        String ss=s.replace(sreplace,snew);
        System.out.print("Replace substring in a string Is : "+ss+"\n");   
    }
    
}
