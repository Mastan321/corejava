package jlc.programs;

public class Test569 {
	
	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		
	}

}

class Hello1{
	int a=0;
	
	static int b;
	{
		//int c;//error if not initialized
		int c=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}