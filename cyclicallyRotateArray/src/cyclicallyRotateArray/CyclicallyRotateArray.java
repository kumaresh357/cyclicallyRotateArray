package cyclicallyRotateArray;

import java.util.Scanner;

public class CyclicallyRotateArray {
	
	public static void rotateArray(int arr[], int size) {
		int temp = arr[size-1];
		for(int i=size-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		for(int rotate:arr) {
			System.out.print(rotate + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("enter each element of array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("provided array");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("rotated array");
		CyclicallyRotateArray.rotateArray(arr, size);
		sc.close();
	}
}
