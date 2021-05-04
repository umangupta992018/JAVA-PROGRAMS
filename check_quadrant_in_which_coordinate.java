import java.util.Scanner;
public class check_quadrant_in_which_coordinate 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The X-Coordinate:");
        int x=sc.nextInt();
        System.out.println("Enter The Y-Coordinate:");
        int y=sc.nextInt();
        if(x>0&&y>0)
        {
            System.out.print("1st Quadrant");
        }
        else if(x<0&&y>0)
        {
            System.out.print("2nd Quadrant");
        }
        else if(x<0&&y<0)
        {
            System.out.print("3rd Quadrant");
        }
        else
        {
            System.out.print("4th Quadrant");
        }
    }
}
