
package product;

import java.util.*;





public class DivideArrayAndJoin{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	int[]a= {1,4,7,8,10};
	int []b= {2,3,9};
	//int[]a={1,2,3,4,7} int []b={8,9,10}
	solve(a,b);
	}
	
	
	//First copy the two array
	public static void solve(int []a,int []b) {
		int c[]=new int[a.length+b.length];
		for(int i=0,m=0,n=0;i<c.length;i++) {
			if(m<a.length)
				c[i]=a[m++];
			else
				c[i]=b[n++];
		}
	
		
		//Ascending order by selection sort
		for(int i=1;i<c.length;i++) {
			int left=i-1,right=c[i];
			while(left>=0 && right<c[left]) {
				c[left+1]=c[left];
				left--;
			}
			c[left+1]=right;
		}
		//Again copy to respective array
		for(int i=0,m=0,n=0;i<c.length;i++) {
			if(m<a.length)
				a[m++]=c[i];
			else if(n<b.length)
			b[n++]=c[i];
		}
		System.out.println("arr1:"+Arrays.toString(a));
		System.out.println("arr1:"+Arrays.toString(b));
	}
}	

	
	