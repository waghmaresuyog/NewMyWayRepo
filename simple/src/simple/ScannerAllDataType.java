package simple;

import java.util.Scanner;

public class ScannerAllDataType {

	public static void main(String[] args) {
		
		byte b;
		System.out.println("Enter byte");
		Scanner sc = new Scanner(System.in);
		b=sc.nextByte();
		System.out.println("Value of Byte is : "+b);
		System.out.println("-----------------------------------------");
		
		short s;
		System.out.println("Enter short value");
		s=sc.nextShort();
		System.out.println("value of short is :"+s);
		System.out.println("------------------------------------------");
		
		int i;
		System.out.println("Enter int value");
		i=sc.nextInt();
		System.out.println("value of int is :"+i);
		System.out.println("------------------------------------------");
		char ch;
		System.out.println("Enter char value");
		ch=sc.next().charAt(0);
		System.out.println("value of char is :"+ch);
		System.out.println("------------------------------------------");
		
		String ss;
		System.out.println("Enter value of string");
			ss=sc.next();
		System.out.println("value of string is : " +ss);
		System.out.println("-----------------------------------------------");
		
		
		
	}

}
