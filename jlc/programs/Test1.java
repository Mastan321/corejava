package jlc.programs;

public class Test1 {
	static int m;
	int n;
	public static void main(String[] args) {
		int m=0;
		Test1 t1=new Test1();
		System.out.println(t1.m);
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
		int c;
	}
	void m(){
		System.out.println(this.m);
		System.out.println(this.n);
	}
}
