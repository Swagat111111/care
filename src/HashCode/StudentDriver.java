package HashCode;

public class StudentDriver {
	public static void main(String[] args) {
		
	
student s=new student(121, "sambit",22);
student s1=new student(121, "sambit", 22);
System.out.println(s.hashCode());
System.out.println(s1.hashCode());

System.out.println(s.hashCode()==s1.hashCode());
}
}