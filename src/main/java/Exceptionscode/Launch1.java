package Exceptionscode;

import java.util.Scanner;

public class Launch1 {
public static void main(String[] args) {
	try {Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numerator:");
	int num =sc.nextInt();
	System.out.println("Enter the denominator:");
	int deno=sc.nextInt();
	 
	int res=num/deno; //critical statement
	System.out.println("Enter the array size:");
	int size=sc.nextInt();
	int arr[]=new int [size];
	System.out.println("Enter the position to which value has to be added");
	int pos=sc.nextInt();
	System.out.println("Enter the value:");
	int val=sc.nextInt();
	
	arr[pos]=val;
	System.out.println(res);
	}
	catch(ArithmeticException e){
	System.out.println("Arithmetic Exception is generated");
	//system.exit(0);
	
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println("ArrayIndexOutOfBoundsException occured");
		}
	catch(NegativeArraySizeException e2){
		//TODO: handler exception
		System.out.println("NegativeArraySizeException occured");
		}
	finally {
		System.out.println("message from finally");
	}
}
}