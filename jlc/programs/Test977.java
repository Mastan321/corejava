package jlc.programs;

public class Test977 {
public static void main(String[] args) {
	Hello977 h=new Hello977();
}
}

class Hello977{
	{
		System.out.println("hello");
		class innner{}
	}
	
	static {
		System.out.println("static block");
		class innner{}
	}
	
	Hello977(){
		class In{}
		
	}
	
	void m1(){
		class iner{}
	}
}