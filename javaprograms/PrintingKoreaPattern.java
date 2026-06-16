package Dora;

public class PrintingKoreaPattern {
public static void main(String[] args) throws InterruptedException {
int n=5;
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(j==0 || i+j==n-1 && i<=n/2 || i==j && i>=n/2)
			System.out.print("K ");
		else
			System.out.print("  ");
	}
	Thread.sleep(500);
	System.out.print("  ");

	
	for(int j=0;j<n;j++) {
		if(j==0 || i==0 || i==n-1 || j==n-1)
			System.out.print("O ");
		else
			System.out.print("  ");
	}
	Thread.sleep(500);
	System.out.print("  ");
	
	for(int j=0;j<n;j++) {
		if(j==0 || i==0 || j==n-1 && i<=n/2 || i==n/2 && j>=n/2 || i==j && i>=n/2)
			System.out.print("R ");
		else
			System.out.print("  ");
	}
	Thread.sleep(500);
	System.out.print("  ");
	
	for(int j=0;j<n;j++) {
		if(j==0 || i==0 || i==n/2 || i==n-1)
			System.out.print("E ");
		else
			System.out.print("  ");
	}
	Thread.sleep(500);
	System.out.print("  ");
	
	for(int j=0;j<n;j++) {
		if(j==0 || i==0 || i==n/2 || j==n-1)
			System.out.print("A ");
		else
			System.out.print("  ");
	}
	Thread.sleep(500);
	System.out.println();
	

}
     
    

	
	
	
}
}
