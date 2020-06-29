package com.core;

public class Test02 {
public static void main(String[] args) {
	
	int ab=10;
	mastan:{
		System.out.println("m block");
		md:{
			System.out.println("md block");
			if(ab==10)
				break md;
			System.out.println("md block ends");
		}
		System.out.println("mastan block ends");
	}
	System.out.println("all completed");
}
}
