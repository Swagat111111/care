package custom_exception;

public class verification {
public void agevalidation(int age) throws Exception
{
	if(age<21)
	{
		throw new control("control until you become 21");
	}
	else if(age>60)
	{
		throw new outofage("u are over age");
	}
	else
	{
		System.out.println("welcome to booth");
	}
}
}
