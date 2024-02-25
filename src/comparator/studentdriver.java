package comparator;

import java.util.TreeSet;

public class studentdriver {

	public static void main(String[] args) {
student s=new student(11, "sagar", 121);
student s1=new student(10, "bikas", 100);
student s2=new student(19, "nabeen", 88);
sortbyage age=new sortbyage();
sortbyname name=new sortbyname();
sortbyid id=new sortbyid();
TreeSet<student>t2=new TreeSet<student>(id);
t2.add(s);
t2.add(s1);
t2.add(s2);
for(student o:t2)
{
	System.out.println(o);
}
TreeSet<student>t1=new TreeSet<student>(name);
t1.add(s);
t1.add(s1);
t1.add(s2);
for(student o:t1)
{
	System.out.println(o);
}
TreeSet<student>t=new TreeSet<student>(age);
t.add(s);
t.add(s1);
t.add(s2);

for(student o:t)
{
	System.out.println(o);
}
	}

}
