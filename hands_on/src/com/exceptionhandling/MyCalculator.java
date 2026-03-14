package com.exceptionhandling;
import java.util.*;
public class MyCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				int n = sc.nextInt();
				int p = sc.nextInt();
				if (n == 0 && p == 0) {
					throw new Exception("n and p should not be zero.");
				}
				if (n < 0 || p < 0) {
					throw new Exception("n or p should not be negative.");
				}
				long result = 1;
				for (int i = 0; i < p; i++) {
					result = result * n;
				}
				System.out.println(result);
			}}
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}}
        
        
                
                
                
                
                
                
             
        
    