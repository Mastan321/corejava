package oops;

public class Test8 {
public static void main(String[] args) {
	D2 ref=new D2(); 
	System.out.println(ref.x);
}
}
class A2
{
	int x=99;
}
class B2 extends A2
{}
class C2 extends B2
{
	String x="JLC";
}
class D2 extends C2
{
	boolean x=false;
}
