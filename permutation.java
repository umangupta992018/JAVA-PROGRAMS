/*Permutations in which n people can occupy r seats in a theatre*/

import java.util.*;
public class permutation
{
    public static int fact(int n)
    {
        int fact=1,i;
        for(i=n;i>=1;i--)
        {
            fact=fact*(i);
        }
        //System.out.print("Factorial of "+n+" is "+fact);
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,f,r,permute=0,a1,b1;
        System.out.print("Enter The Number Of People:");
        n=sc.nextInt();
        System.out.print("Enter The Number Of Seats:");
        r=sc.nextInt();
        permutation a = new permutation();
        a1=fact(n);
        b1=fact(n-r);
        System.out.print("Permutations in which "+n+" people can occupy "+r+" seats in a theatre Is:"+(a1/b1)+".\n");
    }
}
