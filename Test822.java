package com.core;

public class Test822 {
public static void main(String[] args) {
	new B11(2);
}
}
class A11{
	A11(){
	System.out.println("A11() constr");	
	}
}

class B11 extends A11{
	B11(){
		System.out.println();
	}
	B11(int a){
		
		super();
		this();
		System.out.println("b11() constr");
		
	}
}