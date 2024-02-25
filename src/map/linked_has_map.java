package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class linked_has_map {

	public static void main(String[] args) {
LinkedHashMap<String,Integer>l=new LinkedHashMap<String, Integer>();
l.put("chiku", 134);
l.put("sagar", 143);
l.put("pooja", 144);
l.put("lipun", 132);

Set<String>sh=l.keySet();
for(String le:sh)
{
	System.out.println(le+"  "+l.get(le));
}

HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
h.put(121, 120);
h.put(122, 1211);
h.put(111, 121);
h.put(222, 212);




Set<Integer>l1=h.keySet();
for(Integer ka:l1)
{
	System.out.println(ka+" "+h.get(ka));
}
TreeMap<Integer, Integer>t=new TreeMap<Integer, Integer>();
t.put(1, 2);
t.put(2, 2);
t.put(3, 2);
t.put(4, 2);
Set<Integer>l2=t.keySet();
for(Integer kl:l2)
{
	System.out.println(kl+" "+t.get(kl));
}
	}

}
