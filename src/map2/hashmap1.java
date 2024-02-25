package map2;

import java.util.HashMap;
import java.util.Set;

public class hashmap1 {

	public static void main(String[] args) {
HashMap<String, String> hs=new HashMap<String, String>();
hs.put("sagar", "katrina");
hs.put("swagat","kaif");
hs.put("sahoo", "alia");

Set<String>s=hs.keySet();
for(String k:s)
{
	System.out.println(k+""+hs.get(k));
}

	}

}
