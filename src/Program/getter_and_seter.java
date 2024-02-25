package Program;

public class getter_and_seter {
private int empid;
private String name;
private int age;

public getter_and_seter (int empid,String name,int age)
{
	this.empid=empid;
}


public int getId()
{
	return empid;
}
public void setId(int id)
{
	this.empid=id;
}
}
