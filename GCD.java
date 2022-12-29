package Exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GCD {
	public static int calculateGCD(int x, int y) {
		int small;
		int big;
		int gcd = -1;

		if (x > y) {
			big = x;
			small = y;
		} else {
			small = x;
			big = y;
		}
		for (int i = 1; i <= small; i++) {
			if (small % i == 0 && big % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		Collections.addAll(list1, 8, 19, 11, 20, 65, 81);
		Collections.addAll(list2, 12, 39, 21, 30, 15, 94);

		for (int i = 0; i < list1.size(); i++) {
			int result = calculateGCD(list1.get(i), list2.get(i));
			System.out
					.println("For the numbers " + list1.get(i) + " and " + list2.get(i) + " the result is : " + result);
		}
	}
}
