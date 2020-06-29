package com.core;

public class Test814 {
public static void main(String[] args) {
	C10 c10=new C10();
	c10.show();
}
}

class A10{
	int a;
}

class B10 extends A10{
	private String a;
}
class C10 extends B10{
	boolean a=true;
	void show(){
		float a=99.99f;
		System.out.println(a);
		System.out.println(this);
		System.out.println(C10.super.a);
		
	}
}