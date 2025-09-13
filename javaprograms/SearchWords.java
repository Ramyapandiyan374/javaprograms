
package product;

import java.util.*;

public class SearchWords {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "low";

		String s3 = "workattech";
		String s4 = "technology";
		int res1 = solve(s1, s2);
		System.out.println(res1);
		int res = solve(s3, s4);
		System.out.println(res);

	}

	public static int solve(String s3, String s4) {
		if (s3.contains(s4)) {
			return s4.length();
		} else

			return -1;

	}

	public static int solve1(String s1, String s2) {
		if (s1.contains(s2)) {
			return s2.length();
		} else

			return -1;

	}

}
