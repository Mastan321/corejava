
public class Test991 {
public static void main(String[] args) {
	Hello991 h=new Hello991();
	h.m1();
	h.p.sleeping();
}
}

abstract class Person{
	abstract void sleeping();
}

class Hello991{
	
	static interface dd{}
	Person p=new Person(){
		void sleeping(){
			System.out.println("14");
			reading();
		}
		void reading(){
			System.out.println("20");
		}
	};
	
	void m1(){
		
		p.sleeping();
		//p.reading();
	}
	
}