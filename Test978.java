
public class Test978 {

}

class Outer978{
	int a=10;
	static int b=20;
	static void show(){
		System.out.println("show10");
		 class inner{
			 int d=20;
			 final static int f=00;
			void m1(){
				System.out.println("133333333333333");
				System.out.println(new Outer978().a);
				System.out.println(b);
			}
		}
		 new inner().m1();
		 
	}
}