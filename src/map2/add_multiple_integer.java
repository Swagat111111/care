package map2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class add_multiple_integer {

	public static void main(String[] args) {
ArrayList<Integer>a=new ArrayList<Integer>();
a.add(111);
a.add(112);
a.add(113);

ArrayList<Integer>b=new ArrayList<Integer>();
b.add(222);
b.add(221);
b.add(224);

ArrayList<Integer>c=new ArrayList<Integer>();
c.add(333);
c.add(334);
c.add(335);

LinkedHashMap<Integer, List<Integer>> l=new LinkedHashMap<Integer, List<Integer>>();
l.put(1, a);
l.put(2, b);
l.put(3, c);

for(Entry<Integer, List<Integer>> sagar:l.entrySet())
{
	System.out.println(sagar.getKey()+"==>"+sagar.getValue());
}
	}

}
