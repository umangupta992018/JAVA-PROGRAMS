
import java.util.*;
public class check_if_two_strings_match_where_one_string_contains_wildcard_characters
{
    static boolean match(String first,String second)
    {
	if(first.length()==0&&second.length()==0)
        {
	    return true; 
        } 
	if(first.length()>1&&first.charAt(0)=='*'&&second.length()==0)
        {
            return false;
        }
	if((first.length()>1&&first.charAt(0)=='?')||(first.length()!=0&&second.length()!=0&&first.charAt(0)==second.charAt(0)))
        {
	    return match(first.substring(1),second.substring(1)); 
        }
	if(first.length()>0&&first.charAt(0)=='*') 
        {
	    return match(first.substring(1),second)||match(first,second.substring(1)); 
        }
	return false; 
}  
static void test(String first,String second) 
{ 
    if(match(first,second)) 
    {
       System.out.println(first+" and "+second+" Are Equal.\n"); 
    }
    else
    {
       System.out.println(first+" and "+second+" Are Not Equal.\n"); 
    }
} 
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    String str1,str2;
    System.out.print("Enter The 1st String Is : ");
    str1=sc.nextLine();
    System.out.print("Enter The 2nd String Is : ");
    str2=sc.nextLine();
    test(str1,str2);
} 
} 
