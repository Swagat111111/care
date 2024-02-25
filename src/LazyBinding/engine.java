package LazyBinding;

public class engine {
int capacity ;
car c;

public engine(int capacity)
{
	this.capacity=capacity;
}

public void good()
{
	System.out.println("engine is very good");
}
public void company(String name,int price)
{
	c=new car(name,price);
}
}
