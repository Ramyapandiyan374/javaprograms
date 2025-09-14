package thread;
class Table{
	public void print(int num) {
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
		}
	}
}
public class Synchronized {
public static void main(String[] args) {
	Table t1=new Table();
	Thread t=new Thread() {
		synchronized public void run() {
			t1.print(10);
		}
	};
	t.start();
	Thread t3=new Thread() {
		public void run() {
			t1.print(5);
		}
	};
	t3.start();
	t.setName("button");
	System.out.println(t.getName());
	t.setPriority(10);
	System.out.println(t.getPriority());
	
}
}
