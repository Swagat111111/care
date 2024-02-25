package comparator;

import java.util.Comparator;

public class sortbyage implements Comparator<student>{
	
	public int compare(student o1,student o2)
	{
		return o1.age-o2.age;
	}

}
