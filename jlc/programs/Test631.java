package jlc.programs;

public class Test631 {

	public static void main(String[] args) {
		System.out.println("main----"+Hello3.f);
	}
}

class Hello3{
	static {
		System.out.println("sb1----"+Hello3.f);
		
	}
	static int f=99;
	static{
		System.out.println("sb2----"+Hello3.f);
	}
}