package Dora;

public class AllPatterns {
public static void main(String[] args) {
	int n=5;
//	System.out.println("\u001B[31mLeft Triangle\u001B[0m");
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
	
	//Right Traingle
//	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n-i;j++) {
//			System.out.print("  ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
	
	
	//Upper triangle
//	
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	
	
	//Lower triangle
	
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=n-i;j++) {
//			System.out.print("  ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	

	//Normal triangle(Pyramid pattern) -->same as right triangle but in the second loop give single space
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
}
}
