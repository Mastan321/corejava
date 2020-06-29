
public class TestPoint {
	public static void main(String[] args) {
		String s1=new String("mastan");
		String s2="mastan";
		String s3="mastan";
		String s3=s1.intern();
		System.out.println(s3==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
