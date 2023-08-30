package programs;

import java.util.Random;

public class MatrixEx1 {
	public static void main(String[] args) {
		Random rand=new Random();
		int arr[][]=new int[2][2];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=1;
			}
		}
		System.out.println("------------ARRAY 1---------------");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		int arr2[][]=new int[2][2];
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=rand.nextInt(5);
			}
		}
		System.out.println("------------ARRAY 2---------------");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println("------------2 X 2---------------");
		int result[][]=twoCrosstwoArray.multipleMatrix2(arr, arr2);
		for(int i=0;i<=result.length-1;i++)
		{
			for(int j=0;j<=result[i].length-1;j++)
			{
				System.out.print(result[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
