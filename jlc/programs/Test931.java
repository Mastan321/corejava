package jlc.programs;

public class Test931 {
public static void main(String[] args) {
	Hai931 hai=new Hai931(10);
	hai.show();
}
}

class  Hello931{
	int a;
	Hello931(int a){
		this.a=a;
		System.out.println("hello(int) cons");
	}
	{
		System.out.println("hello IB");
	}
	
	void show(){
		System.out.println("show()");
	}
}

class Hai931 extends Hello931{
	Hai931(int a){
		super(a);
		
	}
	
}