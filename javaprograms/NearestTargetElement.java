
package product;

import java.util.*;





public class NearestTargetElement{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		int target=50;
		int a=20;
		int b=70;
		
		int diffA;
		int diffB;
		
		if(target>=a)
			diffA=target-a;
		else
			diffA=a-target;
		if(target>=b)
			diffB=target-b;
		else
			diffB=b-target;
			int nearest;
			if(diffA<diffB)
				nearest=a;
			else
				nearest=b;
		System.out.println("Target:"+target);
		System.out.println("Nearest:"+nearest);
	}
	
	
	
	
}	

	
	