package colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkdlist {

	public static void main(String[] args) {
		List l=new LinkedList();
l.add("sagar");
l.add("rashmi");
l.add("niranjan");
l.add("shruti");

Iterator<Object> i=l.iterator();
while(i.hasNext())
{
	Object la = i.next();
	System.out.println(la);
}

	}

}
