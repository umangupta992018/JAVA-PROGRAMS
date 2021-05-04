
import java.util.Scanner;
public class lcmoftwonumbers 
{
    public static void main(String arg[])
   {
        Scanner sc = new Scanner(System.in);
        int a,b,max,step;
        int lcm=0;
        System.out.println("Enter The 1ST Number:");
        a=sc.nextInt();
        System.out.println("Enter The 2nd Number:");
        b=sc.nextInt();
        if(a>b)
        {
            max = step = a;
        }
        else
        {
            max = step = b;
        }
        while(a!=0)
        {
            if((max % a ==0)&&(max % b ==0))
            {
                lcm = max;
                break;
            }
            max=max+step;
        }
        System.out.println("LCM of a number : "+lcm);
    }
}
   