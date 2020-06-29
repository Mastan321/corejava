package com.core;

public class Test796 {

	public static void main(String[] args) {
		System.out.println(B3.b);
		
	}
}
class A3
{
	static int b=0;
	static{
		System.out.println("A3 static");
	}
}
class B3 extends A3{
	static int a=10;
	static{
		System.out.println("b3 static");
	}
}