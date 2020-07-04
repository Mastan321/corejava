package jlc.programs;

public class Test972 {
public static void main(String[] args) {
	new Outer7().new Inner().showInner();
	new Outer7().showOuter();
}
}

class Outer7{
	private int a=10;
	class Inner{
		private int a=20;
		void showInner(){
			System.out.println("innner---showInner()");
			System.out.println(a);
			System.out.println(this.a);
		}
	}
	void showOuter(){
		System.out.println("innner ---showOuter()");
		System.out.println(a);
		System.out.println(new Inner().a);
		
	}
}
