import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class acronym
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:-");
		String str = sc.nextLine();
		String str1= str;
		String result = "";
		boolean v = true;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ' ')
			{
				v = true;
			}
			else if (str.charAt(i) != ' ' && v == true)
			{
				result =result + (str.charAt(i));
				v = false;
			}
		}

		System.out.println("Acronym of String "+str1+" is :-");
	    System.out.println(result);

	}
}

