package compareto;

import java.util.TreeSet;

public class bikedriver {

	public static void main(String[] args) {
bike b=new bike(12000,"ninja");
bike b1=new bike(11000,"honda");
bike b2=new bike(5000,"sujuki");
bike b3=new bike(14000,"yamha");


TreeSet<bike>t=new TreeSet<bike>();
t.add(b);
t.add(b1);
t.add(b2);
t.add(b3);

for(bike s:t)
{
	System.out.println(s);
}
	}

}
