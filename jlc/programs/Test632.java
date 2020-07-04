package jlc.programs;

public class Test632 {

	public static void main(String[] args) {
		System.out.println("main----"+Hello4.a);
	}
}

class Hello4{
	static int a=10;
	static {
		System.out.println("sb1----"+Hello4.a);
		System.out.println("sb1----"+Hello4.b);
		
	}
	static int b=99;
	static{
		System.out.println("sb1----"+Hello4.a);
		System.out.println("sb2----"+Hello4.b);
	}
}