package jlc.programs;

public class Test6448 {
	public static void main(String[] args) {

		System.out.println("Main---->"+Hello6.a);
	}
}

class Hello6{
	
	static int a=10;
	static Hello6 h=new Hello6();
	
	{
		System.out.println("IB");
	}
	
	static {
		System.out.println("SB");
	}
	
	
	
	
}