package core;

public class Loops {
	public static void main(String[] args) {
		for(String s:args) {
			System.out.println(s);
		}
		
		
		/*
		 * 1
		 * 11
		 * 111
		 * 1111
		 * 11111
		 * */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
		
		
//		double d = 12;
//		System.out.println(d);
//		
//		double i= 12.9;
//		int j = (int)i;
//		System.out.println(j);
		
//		int i = Integer.parseInt(args[0]);
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		
		
//		System.out.println("for loop");
//		for(int i=5;i>=1;i--) {
//			System.out.println(i);
//		}
//		System.out.println("while loop");
//		int j=1;
//		while(j<=5) {
//			System.out.println(j);
//			j++;
//		}
//		System.out.println("do while loop");
//		int k=67;
//		do {
//			System.out.println(k);
//			k++;
//		}
//		while(k<=5);
		
	}
}
