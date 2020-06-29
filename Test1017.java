
public class Test1017 {
public static void main(String[] args) {
	String st1="mst";
	String st2=new String("mst");
	String st3=st2.intern();
	System.out.println(st1==st2);
	System.out.println(st1==st3);
	System.out.println(st2==st3);
	String st4= "mst";
	String st5=new String("mst");
	System.out.println(st4==st5);
	/*System.out.println(st1.hashCode());//same
	System.out.println(st2.hashCode());//same
	System.out.println(st3.hashCode());//same
*/	
	
}
}
