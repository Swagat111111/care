package comparator;

import java.util.Comparator;

public class sortbyid implements Comparator<student>{
	public int compare(student o1,student o2)
	{
		return o1.id-o2.id;
	}

}
