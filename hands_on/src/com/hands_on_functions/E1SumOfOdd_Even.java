/**
 * This program calculate the sum of odd and even numbers
 */
package com.hands_on_functions;
import java.util.Scanner;
public class E1SumOfOdd_Even{
	static void Add(int arr[]) {
		int sumo=0;
		int sume=0;
		for(int num:arr) {
		if(num%2==0) {
			sume+=num;
		}	
		else {
			sumo+=num;
		}
		}
		System.out.println("Even Sum:"+sume);
		System.out.println("Odd Sum:"+sumo);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Add(arr);
        sc.close();
	}

}
