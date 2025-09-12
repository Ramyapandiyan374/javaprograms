
package product;

import java.util.*;





public class Rotation90Degree{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9},};
	   solve(a);
		
	}
	public static void solve(int [][]a) {
		int n=a.length;
		int [][]c=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[j][n-i-1]=a[i][j];
				
			}
		
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
				if(prime(c[i][j])) {
					sum+=c[i][j];
				}
			}
			System.out.println();
			
		}
		System.out.println("Sum of the prime numbers:"+sum);
		}
	public static boolean prime(int num)
	{
		if(num==0 || num==1)
			return false;
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0)
					return false;
			}
		}
		return true;
	}
	
	
	
	
}	

	
	