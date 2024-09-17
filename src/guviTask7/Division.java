package guviTask7;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("enter first number : ");
			int num1=scanner .nextInt();
			System.out.println("enter second number : ");
			int num2=scanner.nextInt();
			int Result=num1/num2;
			System.out.println("Result : "+ Result);
		}
        catch (ArithmeticException e) {
        	System.out.println("Error:Division by zero is not allowed");
        }
		finally {scanner.close();}
	}

}
