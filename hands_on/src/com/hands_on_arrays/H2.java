/**
 * This program records the dice values of Arun and Naveen for 10 turns,
 * calculates their total scores, and determines the winner based on the higher total.
 */

package com.hands_on_arrays;
import java.util.Scanner;
public class H2 {
	public static void main(String[] args) {
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		int sum1=0;
		int sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Arun Dice Choice");
		for(int i=0;i<10;i++) {
			arr1[i]=sc.nextInt();
			sum1+=arr1[i];
		}
		System.out.println("Naveen Dice Choice");
		for(int i=0;i<10;i++) {
			arr2[i]=sc.nextInt();
			sum2+=arr2[i];
		}
		if(sum1>sum2) {
			System.out.println("Arun Wins!");
		}
		else {
			System.out.println("Naveen Wins!");
		}
	}}


