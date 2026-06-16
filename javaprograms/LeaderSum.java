package Dora;

import java.util.ArrayList;

public class LeaderSum {
public static void main(String[] args) {
	int a[]= {16,17,5,3,1,2};
    int n=a.length;
    int curr_leader=a[n-1];
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(a[n-1]);
    for(int i=n-2;i>=0;i--) {
    	if(a[i]>curr_leader) {
    		curr_leader=a[i];
    		arr.add(a[i]);
    	}
    }
    System.out.println(arr);
}
}
