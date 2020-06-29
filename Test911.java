package com.core;

public class Test911 {
	public static void main(String[] args) {
		A911 ob = new A911();
		A911 ob1 = new B911();
		A911 ob2 = new D911();
		B911 ob3 = new B911();
		B911 ob4 = (B911) new A911();
		// B911 ob5=new C911();
		B911 ob6 = new D911();
		D911 ob7 = (D911) new A911();
		A911 ob8 = new E911();
	}

}

class A911 {

}

class B911 extends A911 {

}

class C911 extends A911 {

}

class D911 extends B911 {

}

class E911 extends D911 {

}
