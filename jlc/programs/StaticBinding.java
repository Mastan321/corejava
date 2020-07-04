package jlc.programs;
class ATest
{
	void m1(){
		System.out.println("Parent.....ff....");
	}
}
class BTest extends ATest
{
	static public void m1(){
		System.out.println("Child..ddd.......");
	}
}

public class StaticBinding {

	public static void main(String[] args) {
		ATest a =new BTest();
		a.m1();
	}

}
