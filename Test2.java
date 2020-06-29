package oops;

public class Test2 {
int a=10;
public Test2(){
	//this(); Error Recursive constructor call.
}
{
	System.out.println(Test2.this.a);
	int a=10;
}
public static void main(String[] args) {
	//System.out.println(">>a"+a);//Error
	System.out.println(">>a"+new Test2().a);
	
}
}
