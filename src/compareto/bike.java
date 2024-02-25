package compareto;

public class bike implements Comparable<bike>{
	int cost;
	String brand;

	public bike(int cost,String brand)
	{
		this.cost=cost;
		this.brand=brand;
	}
	public int compareTo(bike b)
	{
	
		return b.brand.compareTo(this.brand);
	}
	public String toString()
	
	{
		System.out.println(cost);
		System.out.println(brand);
		return "";
	}
}
