package Dora;

public class Target {
public static void main(String[] args) {
	int []a= {3,6,4,21,74,99};
	int target=10;
	solve(a,target);
}
public static void solve(int [] a,int target) {
	int l=0,r=a.length-1;
	while(l<r) {
		if(a[l]+a[r]==target) {
			System.out.println(a[l]+":"+a[r]);
			l++;
			r--;
			
		}
		else if(a[l]+a[r]>target)
			r--;
		else
			l++;
	}
}
}
