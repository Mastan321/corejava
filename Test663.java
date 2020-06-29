package com.core;

public class Test663 {
public static void main(String[] args) {
	Hello7 h=new Hello7();
	System.out.println(h.a);
}
}

class Hello7{
	final int a ;
	
	Hello7(){
	a=20;	
	}
	
	{
		a=10;
	}
}