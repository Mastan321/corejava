package jlc.programs;

public class Test12 {
public static void main(String[] args) {
	//Hello2 h2=new Hello2();
	System.out.println(Hello2.a);
	
}
}
class Hello2
{
	static int a;
	static {
		System.out.println("SIB 1");
	}
	static {
		System.out.println("SIB 2");
	}
}