package colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
LinkedHashSet hs=new LinkedHashSet();
hs.add("sonali");
hs.add("sagar");
hs.add("lisha");
hs.add("tinu");
//hs.add("sagar");

ArrayList<String>revers=new ArrayList<String>(hs);
Collections.reverse(revers);
System.out.println(revers);
//for(int i=0;i<revers.size();i++)
//{
//	System.out.println(revers.get(i));
//}
//System.out.println("kkkkkkk");
//for(int i=revers.size()-1;i>=0;i--)
//{
//	System.out.println(revers.get(i));
//}


//for(Object h:hs)
//{
//	System.out.println(h);
//}
//Iterator <String>i=hs.iterator();
//while(i.hasNext())
//{
//	System.out.println(i.next());
//}

	}

}
