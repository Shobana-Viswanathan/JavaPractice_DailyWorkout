/**
 * This program simulates rolling a dice 100 times.
 * It stores the frequency of each dice number (1 to 6)
 * using an array and then displays how many times
 * each number occurred.
 */

package com.hands_on_arrays;
public class M2 {
	public static void main(String[] args) {
		 int[] freq = new int[6];
		 for (int i = 0; i < 100; i++) {
			 int roll = (int)(Math.random() * 6) + 1;
			 if (roll == 1) freq[0]++;
			 else if (roll == 2) freq[1]++;
			 else if (roll == 3) freq[2]++;
			 else if (roll == 4) freq[3]++;
			 else if (roll == 5) freq[4]++;
			 else if (roll == 6) freq[5]++;
		 }
		 for (int i = 0; i < 6; i++) {
			 System.out.println("Number " + (i + 1) + " occurred " + freq[i] + " times");
		 }
	}
}




