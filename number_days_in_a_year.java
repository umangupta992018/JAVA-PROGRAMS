import java.util.Scanner;
public class number_days_in_a_year 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int month,year;
        System.out.println("Enter The Month:");
        month=sc.nextInt();
        System.out.println("Enter The Year:");
        year=sc.nextInt();
        if(month>=1&&month<=12)
        {
        if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
        {
           System.out.println("31 days,Not Leap Year.\n");
        }
        else if((month==2)&&(year%4==0)||(year%100==0)&&(year%400==0))
        {
            System.out.println("29 days,Leap Year.\n");
        }
        else
        {
            System.out.println("28 days,Not Leap Year.\n");
        }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}