package oops;

public class Test10 {
public static void main(String[] args) {
	Hello h;
	new Hello();
	System.out.println("Completed");
}
}
class Hello
{
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
}