package Practice.Codes.Day_9;

import java.util.Scanner;

class Declaration {

	public static void enter_Array(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array : ");

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

	}

	public static void display_Array(int[] arr) {
		System.out.print("The elements of array are: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}

class PrintEle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		Declaration.enter_Array(arr);
		Declaration.display_Array(arr);
		sc.close();

	}

}
