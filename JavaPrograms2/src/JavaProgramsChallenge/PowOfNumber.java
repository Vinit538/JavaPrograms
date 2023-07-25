package JavaProgramsChallenge;

import java.util.Scanner;

public class PowOfNumber {
	public static void main(String[] args) {
		int x,y;
		double z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		x=sc.nextInt();
		System.out.println("Enter the power of the number");
		y=sc.nextInt();
		z=Math.pow(x, y);
		System.out.println("The power "+x+" and "+y+" is : "+z );
	}
}
