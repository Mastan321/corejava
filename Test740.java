package com.core;

public class Test740 {
	public static void main(String[] args) {
		Hello740 h = new Hello740();
		h.show();

	}
}

class Hello740 {
	void show(int b,int... a) {
		System.out.println(""+a);
	}
}