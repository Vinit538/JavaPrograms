package programs;

import java.util.Random;
//2d Jagged array example  
public class jaggedArray {
	public static void main(String[] args) {
		Random rand=new Random();
		int arr[][]=new int[5][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[1];
		arr[3]=new int[3];
		arr[4]=new int[5];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=rand.nextInt(10);
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
