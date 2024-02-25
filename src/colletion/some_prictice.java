package colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class some_prictice {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add("SAGAR");
al.add("manoj");
al.add(20);
al.add(30);
al.add("sonali");

for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
for(Object a:al)
{
	System.out.println(a);
}
Iterator i=al.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
System.out.println(al);
ListIterator l=al.listIterator();
while(l.hasNext())
{
	System.out.println(l.next());
}
while(l.hasPrevious())
{
	System.out.println(l.previous());
}
	}

}
