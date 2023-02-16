package core;

import java.util.Scanner;

//3 streams
//1.in - 
//2.out - printstream
//3.err -
//1.primitive - int,byte,short,long,float,double,boolean,char
//2.non -primitive - array,string,class





class A{
	public void run() {
		System.out.println("run method inside a class");
	}
}
public class First {
	public static void main(String[] args) {
		System.out.println("hello java");
		A a = new A();
		a.run();
		
		
		int i;
		System.out.println("enter i = ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("i = "+i);
		double d;
		System.out.println("ener d = ");
		d = sc.nextDouble();
		System.out.println(d);
		
		
		
//		System.out.println("hello java");
//		System.out.println("hello java again");
//		int jay = 1;
//		System.out.println("values of i = "+jay);
//		float f= 3.14897641216584f;
//		System.out.println(f);
//		double d = 3.14897641216584;
//		System.out.println(d);
//		System.out.println(jay+d);
//		int i=1,j=2,k,l;
//		System.out.println(i);
//		k = ++i;
//		l = i++;
//		System.out.println(k);
//		System.out.println(l);
////		System.out.println("value of i and j = "+(i+j));
////		++i;
////		i+=2;
////		System.out.println(i);
//		
//		int a = -10,b=50;
////		b += a; //b = b+a
//		b =+ a;
//		System.out.println(b);
		
		
		
		
	}
}
