package core;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5};
		for(int index=0;index<i.length;index++) {
			System.out.println(i[index]);
		}
		int size;
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter size of array : ");
		size = sc.nextInt();
		int arr[] = new int[size];
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter value at arr["+index+"] :");
			arr[index] = sc.nextInt();
		}
		
		int num,counter=0;
		System.out.println("enter number to search in array :");
		num = sc.nextInt();
		for(int index=0;index<arr.length;index++) {
			if(num == arr[index]) {
				counter++;
			}
		}
		if(counter ==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
