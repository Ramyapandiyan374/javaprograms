
package product;

import java.util.*;





public class MergerTwoArrayAndSort{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	int []a= {1,2,2,5,5,8};
	int[]b= {2,2,5,6,7,8};
	}
	public static void solve(int []a,int[]b) {
		int c[]=new int[a.length+b.length];
		for(int i=0,m=0,n=0;i<c.length;i++) {
			if(m<a.length) {
				c[i]=a[m++];
			}
			else if(n<b.length){
				c[i]=b[n++];
			}
		}
        for(int i=0;i<c.length-1;i++) {
        	for(int j=0;j<c.length-1;j++) {
        		if(c[j]>c[j+1]) {
        			int temp=c[j];
        			c[j]=c[j+1];
        			c[j+1]=temp;
        			
        		}
        	}
        }
		System.out.println(Arrays.toString(c));
	}
}	

	
	