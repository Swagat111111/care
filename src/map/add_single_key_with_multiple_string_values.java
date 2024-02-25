package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class add_single_key_with_multiple_string_values {

	public static void main(String[] args) {
List<String>l=new ArrayList<String>();
l.add("sagar");
l.add("tapan");
List<String>l1=new ArrayList<String>();
l1.add("pintu");
l1.add("bonty");

List<String>l2=new ArrayList<String>();
l2.add("chikun");
l2.add("likun");

HashMap<String,List<String>>map=new HashMap<String, List<String>>();
map.put("a", l);
map.put("b", l1);
map.put("c", l2);

for(  Entry<String, List<String>> k:map.entrySet())
{
	System.out.println(k.getKey());
	System.out.println(k.getValue());
}
	}

}
