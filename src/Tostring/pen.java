package Tostring;

public class pen {
int price;
String company;
String color;

public pen(int price,String company,String color)
{
	this.price=price;
	this.company=company;
	this.color=color;
}

public String toString()
{
	System.out.println(price);
	System.out.println(company);
	System.out.println(color);
	return "";
}
}
