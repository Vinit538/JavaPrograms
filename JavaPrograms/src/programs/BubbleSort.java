package programs;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 86, 42, 23, 18, 25 };
		for (Object x : arr) {
			System.out.print(x + ",");
		}
		System.out.println();
		int[] arr1=bubbleSort1(arr);
		int[] arr2=bubbleSort2(arr);
		
		System.out.println("Bubble Sort using 1st Method");
		for (Object x : arr1) {
			System.out.print(x + ",");
		}
		System.out.println();
		System.out.println("Bubble Sort using 2nd Method");
		for (Object x : arr2) {
			System.out.print(x + ",");
		}
		System.out.println();
	}

	public static int[] bubbleSort1(int arr[]) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	// Another Method to sort
	public static int[] bubbleSort2(int arr[]) {
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}
