package programs;

import java.util.Random;

public class threeDJaggedArray {
	public static void main(String[] args) {
		Random rand=new Random();
		int arr[][][]=new int[3][][];
		arr[0]=new int[2][];
		arr[0][0]=new int[4];
		arr[0][1]=new int[3];
		arr[1]=new int[3][];
		arr[1][0]=new int[4];
		arr[1][1]=new int[2];
		arr[1][2]=new int[3];
		arr[2]=new int[2][];
		arr[2][0]=new int[6];
		arr[2][1]=new int[2];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					arr[i][j][k]=rand.nextInt(15);
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
