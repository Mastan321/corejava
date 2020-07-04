package jlc.programs;

public class Test961 {
public static void main(String[] args) {
	Outer outObj=new Outer();
	outObj.m1();
	outObj.m2();
	Outer.inner iObj=new Outer.inner();
	iObj.show();
}
}

class Outer{
	int a=10;
	static int b=20;
	void m1(){
		System.out.println("outer--->m1()");
		new inner().show();
	}
	
	static void m2(){
		System.out.println("outer--->m2()");
		System.out.println(inner.show());
		
		
	}
	
static 	class inner{
		int x=11;
		static int y=22;
		static void show(){
			System.out.println("inner show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			m1();
			m2();
			
		}
	}
static void m3(){
	System.out.println("innnerm3");
	
}
}
