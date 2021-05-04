
import java.util.Scanner;
public class area_of_a_circle 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Enter The Radius Of A Circle:\n");
        r=sc.nextDouble();
        double area = ((3.14)*(r*r));
        System.out.println("Area of a Circle : "+area);
    }
    
}
