package thread_by_runable;

public class driver {

	public static void main(String[] args) {
Runnable r=new student();
Thread t=new Thread(r);
t.start();
Runnable r1=new employee();
Thread t1=new Thread(r1);
t1.start();  

	}

}
