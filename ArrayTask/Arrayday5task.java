
package ArrayTask;

import java.util.Scanner;

public class Arrayday5task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Third Largest Element in the Array : " + arr[2]);
		for (int k = 0; k < n; k++) {
			for (int l = k; l < n; l++) {
				if (arr[k] > arr[l]) {
					int temp = arr[k];
					arr[k] = arr[l];
					arr[l] = temp;
				}
			}
		}
		System.out.println("The Third Smallest Element in the Array : " + arr[2]);
	}
}
