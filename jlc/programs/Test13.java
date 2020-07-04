package jlc.programs;

public class Test13 {
	public static void main(String[] args) {
		Hello3 h3=new Hello3();		
	}
	Hello3 h4=new Hello3();		
}
class Hello3{
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIb 2");
	}
}