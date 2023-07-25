package JavaProgramsChallenge;
//Sort the Array
public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 5, 8, 2, 6, 9 };
		sortArray(arr);

	}

	public static void sortArray(int a[]) {
		
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for (Object x : a) {
			System.out.println(x);
		}
	}
}
