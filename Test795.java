package com.core;

public class Test795 {
public static void main(String[] args) {
	new B1();
}
}

class A1{
	static int a=99;
	static{
		System.out.println("A static"+a);
	}
}

class B1 extends A1{
	static int b=99;
	static{
		System.out.println("B static "+a);
		System.out.println("B staticb "+b);
	}
}