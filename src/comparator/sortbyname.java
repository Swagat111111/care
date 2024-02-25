package comparator;

import java.util.Comparator;

public class sortbyname implements Comparator<student>{
public int compare(student o1,student o2)
{
	return o1.name.compareTo(o2.name);
}
}
