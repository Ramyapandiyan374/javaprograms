
package product;

import java.util.*;





public class LongestStringReverse{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	String s="java is a powerful language";
	
	String []a=s.split(" ");
	String longest=a[0];
	for(int i=0;i<a.length;i++) {
		if(a.length>longest.length()) {
			longest=a[i];
		}
	}
	String res=rev(longest);
	System.out.println("The reverse of the longest String: "+res);

}
	
	public static String rev(String s) {
		String ans="";
		for(int  i=s.length()-1;i>=0;i--) {
			ans=ans+s.charAt(i);
		}
		return ans;
	}
}	

	
	