package programs;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample1 {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[5][4];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=rand.nextInt(50);
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
