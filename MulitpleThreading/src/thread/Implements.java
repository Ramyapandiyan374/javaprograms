package thread;


	





public class Implements {
public static void main(String[] args) {
//	Dress d=new Dress();                                  ---->Creating a object
//	Runnable r=new Runnable() {                           ----->Creating anonymous class Block
//		public void run() {
//			for(int i=1;i<=5;i++) {
//				System.out.println(i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				}
//			}
//		}
//	};
	
	Runnable r=()-> {                           
		
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		
	};	
	
	
	
	
	
	Thread t=new Thread(r);
	t.start();
	
	
	
	
	
	
	
}
}
