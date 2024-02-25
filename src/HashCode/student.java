package HashCode;

import com.google.common.base.Objects;

//import com.google.common.base.Objects;

public class student {
int id;
String name;
int age;

public student(int id,String name,int age)
{
	this.id=id;
	this.name=name;
	this.age=age;
}

public int hashCode()
{
	return Objects.hashCode(id,age,name);
}
}
