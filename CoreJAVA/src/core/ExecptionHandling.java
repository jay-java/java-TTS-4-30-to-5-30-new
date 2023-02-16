package core;

import java.util.InputMismatchException;
import java.util.Scanner;
//1.try 2.catch 3.finally 4.throw 5.throws
class Divide{	//B
	public void division() throws ArithmeticException,InputMismatchException,Exception{
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i  =sc.nextInt();
		System.out.println("enter j = ");
		j =sc.nextInt();
		k = i/j;
		System.out.println(k);
		throw new ArithmeticException();
	}
}
public class ExecptionHandling {	//A
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
//			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("number cannot divide by string");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
//		try {
//			int i,j,k;
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter i = ");
//			i  =sc.nextInt();
//			System.out.println("enter j = ");
//			j =sc.nextInt();
//			k = i/j;
//			System.out.println(k);
//			System.exit(10);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("cannot divide by zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("cannot divide by string value");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will execute everytime");
//		}
	}
}
