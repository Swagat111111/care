package colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
TreeSet<String>t=new TreeSet<String>();
t.add("sagar");
t.add("swagat");
t.add("sahoo");

ArrayList<String>a=new ArrayList<String>(t);
Collections.reverse(a);
System.out.println(a);
//for(int i=a.size()-1;i>=0;i--)
//{
//	System.out.println(a.get(i));
//}
	}

}
