package equalsmethod;

public class pen {
int price;
String color;
String company;

public pen(int price,String color,String company)
{
	this.price=price;
	this.color=color;
	this.company=company;
}

public boolean equals(Object o)
{
	pen p3=(pen)o;
	return (this.company==p3.company && this.price==p3.price && this.color==p3.color);
}
}
