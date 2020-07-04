package jlc.programs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HMapEx {
public static void main(String[] args) {
	HashMap lHM=new HashMap();
	lHM.put(22,22);
	lHM.put(30, 34);
	System.out.println(lHM);
	char c='"';
	int a=10;
	a=++a;
	System.out.println(a);
	a=++a;
	a=++a;
	System.out.println(a);
	int as=0/0;
	
	System.out.println(as);
	System.out.println("--->"+c);
	Set set=lHM.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
		Map.Entry obj=(Map.Entry)it.next();
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
	}
	
}
}
