package ChallengeProgram;

import java.util.Scanner;

public class pailndromeOrnot {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=scan.nextInt();
	boolean result= isPailndrome(num);
		if(result == true) {
			System.out.println(num+"  is Pailndrome");
		}
		else
		{
			System.out.println(num+"  is Not Pailndrome");
		}
	}
	static public boolean isPailndrome(int x)
	{
		if(x < 0 || (x!=0 && x%10 == 0))return false;
		int rev=0;
		while(x > rev)
		{
			rev=rev*10 + x % 10;
			x=x/10;
		}
		return (x==rev||x==rev/10);
	}
}
