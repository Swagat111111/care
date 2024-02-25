package LazyBinding;

public class driverlazybinding {

	public static void main(String[] args) {
engine e=new engine(5000);
System.out.println(e.capacity);
e.good();
e.company("maruti",80000);
System.out.println(e.c.name);
System.out.println(e.c.price);
e.c.car();
e.c.gift();
	}

}
