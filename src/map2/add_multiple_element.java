package map2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.checkerframework.checker.units.qual.m;

public class add_multiple_element {

	public static void main(String[] args) {
ArrayList<String>al=new ArrayList<String>();
al.add("sagar");
al.add("swagat");
al.add("sahoo");
ArrayList<String>al1=new ArrayList<String>();
al1.add("niranjan");
al1.add("sahoo");

ArrayList<String>al3=new ArrayList<String>();
al3.add("rashmi");
al3.add("rekha");
al3.add("sahoo");

LinkedHashMap<String, List<String>> map=new LinkedHashMap<String, List<String>>();
map.put("a", al);
map.put("b", al1);
map.put("c", al3);

for(Entry<String, List<String>> m:map.entrySet())
{
	System.out.println(m);
}

	}

}
