package oops;

public class Test11 {
public static void main(String[] args) {
	System.out.println("main:"+Hello1.a);
}
}

class Hello1
{
	static int a;
	int b;
	static 
	{
		a=10;
		//b=10; error
		System.out.println("static block");
	}
}