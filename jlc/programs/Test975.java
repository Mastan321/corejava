package jlc.programs;

public class Test975 {
}
class Outer975{
	static int i=-0;
	void showOuter(){
		
		System.out.println("outer---showouter()");
		System.out.println(new inner().x);
		System.out.println(inner.y);
		inner.m1();
	}
	static class inner{
		int x=10;
		static int y=22;
		static void m1(){
			System.out.println("innnerm1()"+i);
		}
	}
	
}