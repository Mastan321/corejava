
public class Test892 {
public static void main(String[] args) {
	B0 o=new B0();
	o.m1();
}
}

class A0{
static void m1(){

	System.out.println("super method");
	}
/*protected void m2()
}
*/
}
class B0 extends A0{
	static void  m1(){
		 System.out.println("m1 from bo called");
	}
	 /*void m2(){
		 
	 }*/
	 
}