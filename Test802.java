package com.core;

public class Test802 {
public static void main(String[] args) {
	A7 a7=new A7();
	a7.show();
}
}

class A6{
	static void show(){
		System.out.println("show() A6");
	}
	static{
		System.out.println("A6 static");
	}
}

class A7 extends A6{
	static{
		System.out.println("static A7");
		
	}
}