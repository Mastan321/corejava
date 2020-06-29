package com.core;

public class Test564 {

	
	public static void main(String[] args) {
		int i=new Hello().a;
		System.out.println(Hello.a);
	}
}

class Hello{
	static final int a;
	static{
		a=20;
	}
}