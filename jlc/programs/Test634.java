package jlc.programs;

public class Test634 {

	public static void main(String[] args) {
		H h=new H();
		System.out.println(h.a);
		
	}
}
class H{
	{
		System.out.println(this.a);;
	}
	int a=20;
}