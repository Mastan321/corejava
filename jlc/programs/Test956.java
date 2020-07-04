package jlc.programs;

public class Test956 {
public static void main(String[] args) {
	inter22 in=new Hello956();
	in.m1();
	Object obj=in;
	System.out.println(obj.toString());
}
}

interface inter22{
	void m1();
}

class Hello956 implements inter22{
public void m1(){
	System.out.println("m1");
}
void m2(){
	System.out.println("m2");
}
}