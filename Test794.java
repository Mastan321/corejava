package com.core;

public class Test794 {
public static void main(String[] args) {
	new B();
}
}

class A{
	static{
		System.out.println("A static");
	}
}

class B extends A{
	static{
		System.out.println("B static ");
	}
}