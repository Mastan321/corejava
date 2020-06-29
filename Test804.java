package com.core;

public class Test804 {
	public static void main(String[] args) {
		new B8();
	}

}

class A8 {
static{
	System.out.println("a8 static");
}
{
	System.out.println("instance a8");
}
	A8() {
		System.out.println("A8 const");
	}
}

class B8 extends A8 {
	static{
		System.out.println("static b8");
	}
	{
		System.out.println("instance b8");
	}
	B8() {
		System.out.println("B8 const");
	}

	}
class C8 extends B8 {
C8(){
	System.out.println("c8()");
}
static{
	System.out.println("c8 static");
}
{
	System.out.println("c8 instance");
}
}
