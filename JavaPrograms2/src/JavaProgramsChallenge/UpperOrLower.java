//Java program To convert the string to upperCase or lowerCase 
//If the String is length is even method should return String in upperCase
//else String in length is odd method should return String in lowerCase




package JavaProgramsChallenge;

import java.util.Scanner;

public class UpperOrLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the String");
			String Str=sc.next();
			String Result=UpperOrLowerApp.upperORlowerMethod(Str);
			System.out.println("Entered String is : "+Str+" || " +" String is Returnd in : "+ Result );
		}
	}
}
class UpperOrLowerApp
{
	public static String upperORlowerMethod(String Str)
	{
		String resultString="";
		
		if(Str.length() % 2 == 0)
		{
			resultString=Str.toUpperCase();
		}
		else
		{
			resultString=Str.toLowerCase();
		}
		
		return resultString;
	}
}