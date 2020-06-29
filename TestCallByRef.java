
public class TestCallByRef {
public static void main(String[] args) {
	String str="mastan";
	new TestCallByRef().m1(str);
	System.out.println("after call----"+str);
}

void m1(String str){
	System.out.println("in method----"+str);
	str=new String("Aarzoo");
	System.out.println("in method after change----"+str);
}
}
