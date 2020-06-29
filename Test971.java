
public class Test971 {

}

class Outer6{
	int a=10;
	class Inner{
		int a=22;
		void show(){
			System.out.println("inner show()");
			int a=33;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Inner.this.a);
			//System.out.println(super.a);error
			System.out.println(Outer.this.a);
		}
	}
}