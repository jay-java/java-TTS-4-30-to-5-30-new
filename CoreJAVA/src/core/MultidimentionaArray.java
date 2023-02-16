package core;

import java.util.Scanner;

public class MultidimentionaArray {
	public static void main(String[] args) {
		int i[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<=2;r++) {
			for(int c=0;c<=2;c++) {
				System.out.print(i[r][c]+" ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		int r,c,rv,cv;
		System.out.println("enter number of rows : ");
		r = sc.nextInt();
		System.out.println("enter number of columns : ");
		c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int index=0;index<arr.length;index++) {
			for(int cindex=0;cindex<arr.length;cindex++) {
				System.out.println("enter value at arr["+index+"]["+cindex+"] : ");
				arr[index][cindex] = sc.nextInt();
			}
			System.out.println();
		}
		for(int index=0;index<arr.length;index++) {
			for(int cindex=0;cindex<arr.length;cindex++) {
				System.out.print(arr[index][cindex]+" ");
			}
			System.out.println();
		}
	}
}
