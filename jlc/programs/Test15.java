package jlc.programs;

public class Test15 {
 public static void main(String[] args) {
	System.out.println(new Hello6().a);
}
}
class Hello6
{
	final int a=99; //correct:No errors
	/*final int a;
	{
		a=99;
	}//Correct no error :we can initialize final variable in instance block also.
*/
	/*final int a;
	a=10;            //ERROR:Can't initialize final variable next statement.
*/	}