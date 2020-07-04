package jlc.programs;

public class Test810 {
public static void main(String[] args) {
	B9 b9=newB9();
	b9.show();
}
}

class A9{
	static int a=9;
}
class B9 extends A9{
	static int a=10;
	static void show(){
		int a=5;
		System.out.println(a);
		System.out.println(B9.a);
		System.out.println(A9.a);
		
	}
}