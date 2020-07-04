package jlc.programs;
import java.util.Scanner;


public class Test1019 {
public static void main(String[] args) {
	String str1="mst";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str3=sc.nextLine();
	System.out.println("enter string");
	String str4=sc.nextLine();
	String str5=str3.intern();
	String str6=str4.intern();
	System.out.println(str3==str4);
	System.out.println(str5==str6);
	System.out.println(str1==str5);
}
}
