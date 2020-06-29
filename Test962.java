
public class Test962 {
public static void main(String[] args) {
	Outer1 outObj=new Outer1();
	outObj.show();
}
}

class Outer1{
	void show(){
		System.out.println("outer--show()");
		
		Inner iobj=new Inner();
		System.out.println(iobj.x);
		iobj.m1();
		System.out.println(Inner.x);
		
		
	}
	class Inner{
		static final int x=11;
		void m1(){
			System.out.println("inner---m1()");
		}
	}
}