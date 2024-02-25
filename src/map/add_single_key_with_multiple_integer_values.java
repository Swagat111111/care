package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class add_single_key_with_multiple_integer_values {

	public static void main(String[] args) {
List<Integer>i=new ArrayList<Integer>();
i.add(1234);
i.add(123);

List<Integer>i2=new ArrayList<Integer>();
i2.add(1245);
i2.add(1111);

List<Integer>i3=new ArrayList<Integer>();
i3.add(12345);
i3.add(1212);



LinkedHashMap<String, List<Integer>> map=new LinkedHashMap<String, List<Integer>>();
map.put("a", i);
map.put("b", i2);
map.put("c", i3);
for(Entry<String, List<Integer>> o:map.entrySet())
{
	System.out.println(o);
}
	}

}
