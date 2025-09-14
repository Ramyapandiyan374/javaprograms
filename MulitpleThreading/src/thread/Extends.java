package thread;

class Food extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("update db..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Num extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Extends {
	public static void main(String[] args) throws InterruptedException {
		Food f = new Food();
		Num n = new Num();
		f.start();
		if (f.isAlive()) {
			System.out.println("Excuting.....");
		}
		n.start();
		f.join();
		n.join();

		System.out.println("Bye...");

	}

}
