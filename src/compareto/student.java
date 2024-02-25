package compareto;

public  class student implements Comparable<student>{

int age;
String name;
int id;
public student(int age,String name,int id)
{
	this.age=age;
	this.name=name;
	this.id=id;
}

public int compareTo(student o)
{
	return o.age-this.age;
}
public String toString()
{
	System.out.println(age);
	System.out.println(name);
	System.out.println(id);
	return " ";
}


}


	

