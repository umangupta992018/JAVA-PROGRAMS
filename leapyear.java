import java.util.Scanner;
public class leapyear 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter The Year:");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year+" is a Leap Year.\n");
                }
                else
                {
                    System.out.println(year+" is not a Leap Year.\n");
                }
            }
            else
            {
                System.out.println(year+" is a Leap Year.\n");
            }
        }
        else
        {
            System.out.println(year+" is not a Leap Year.\n");
        }
    }
}
