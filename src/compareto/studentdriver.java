package compareto;

import java.util.TreeSet;

//import colletion.treeset;

public class studentdriver  {


	public static void main(String[] args) {
student s1=new student(11, "sagar", 101);
student s2=new student(10, "virat", 10);
student s3=new student(13, "mahi", 100);
student s4=new student(14, "jadeja", 120);


TreeSet<student>t=new TreeSet<student>();
t.add(s1);
t.add(s2);
t.add(s3);
t.add(s4);
for(student s:t)
{
	System.out.println(s);
}

	}

}
