package Dora;

import java.util.HashSet;

public class LargestWordInSentenceWithoutDuplicates {
	public static void main(String[] args) {
		String s="abcdabcbbd";
		char[]a=s.toCharArray();
		int left=0,max=0;
		HashSet<Character> set=new HashSet<>();
		for(int right=0;right<s.length();right++) {
			while(set.contains(a[right])) {
				set.remove(a[left]);
				left++;
				
			}
			set.add(a[right]);
			max=Math.max(max, right-left+1);
		}
		System.out.println("Max:"+max);
		}
	}


