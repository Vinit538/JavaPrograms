package programs;

public class twoCrosstwoArray {
	public static int[][] multipleMatrix2(int [][]a,int [][]b)
	{
		int rowsA=a.length;
		int colsA=a[0].length;
		int rowsB=b.length;
		int colsB=b[0].length;
		
		if(colsA != rowsB)
		{
			System.out.println("Matrix Dimension are not equal");
		}
		int [][]result=new int[rowsA][colsB];
		for(int i=0;i< rowsA;i++)
		{
			for(int j=0;j<colsB;j++)
			{
				for(int k=0;k<colsA;k++)
				{
					result[i][j] += a[i][j]*b[k][j];
				}
			}
		}
		return result;
	}
}
