package jlc.programs;

public class Test799 {
public static void main(String[] args) {
	A5 a5=new A5();
}
}

class A4
{
	int a=10;
	static{
		System.out.println("static b a4");
	}
	{
		
		System.out.println("instance a4");
	}
}

class A5 extends A4{
	int b=99;
	{
		System.out.println("instance A5");
		//System.out.println(a);
		//System.out.println(b);
	}
	static{
		System.out.println("static b a5");
	}
	
}