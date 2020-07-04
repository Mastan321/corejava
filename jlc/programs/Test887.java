package jlc.programs;

public class Test887 {
public static void main(String[] args) {
	 Hai h=new Hai();
	 h.m1();
}
}

class Hello{
final	A1 m1(){
		return new A1();
	}
}

class Hai extends Hello{
	B1 m1(){
		return new B1();
	}
}

class A1{
	
}

class B1 extends A1{
	
}