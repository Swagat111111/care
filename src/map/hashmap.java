package map;

import java.util.HashMap;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
HashMap hs = new HashMap();

hs.put("sagar",143);
hs.put("swagat",144);
hs.put("sahoo",145);
hs.put("2in",146);

System.out.println(hs.get("sagar"));

System.out.println(hs.containsValue(144));
System.out.println(hs.containsKey("sagar"));
Set h= hs.keySet(); 
for(Object le:h)
{
	System.out.println(le+" "+hs.get(le));
}
	}

}