package map;

import java.util.LinkedHashMap;
import java.util.Set;

public class again_linked_hashmap {

	public static void main(String[] args) {
LinkedHashMap lm=new LinkedHashMap();
lm.put("sagar", 123);
lm.put("swagat", 124);
lm.put("sahoo", 125);
lm.put("2in", 126);


Set l=lm.keySet();
for(Object k:l)
{
	System.out.println(k+" "+lm.get(k));
}
	}

}
