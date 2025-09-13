
package product;

import java.util.*;





public class MaxNumberOfWords{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String s="java is a good java is a powerful java  easy";
		String []a=s.split(" ");
		solve(a);
		
	}
	public static void solve(String []s) {
		Map <String,Integer> map=new LinkedHashMap();
		for(String data:s) {
			map.put(data, map.getOrDefault(data, 0)+1);
				
			}
		int max=0;
		String mostFrequentWords=null;
		    for(Map.Entry<String,Integer>data:map.entrySet()) {
		    	 if(data.getValue()>max) {
		    		 max=data.getValue();
		    		 mostFrequentWords= data.getKey();
		    		 
		    	 }
		    }
		    for(int i=0;i<max;i++) {
		    	System.out.println(mostFrequentWords);
		    }
		System.out.println("Maximum number of words"+max);
		}
	}
	
	
