package com.assessment;

import java.util.Scanner;

public class DigitalLock {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter input1: ");
    	int input1 = sc.nextInt();
    	System.out.print("Enter input2: ");
    	int input2 = sc.nextInt();
    	System.out.print("Enter input3: ");
    	int input3 = sc.nextInt();
    	int u1 = input1 % 10;
    	int t1 = (input1 / 10) % 10;
    	int h1 = input1 / 100;
    	int u2 = input2 % 10;
    	int t2 = (input2 / 10) % 10;
    	int h2 = input2 / 100;
    	int u3 = input3 % 10;
    	int t3 = (input3 / 10) % 10;
    	int h3 = input3 / 100;
    	int unit = Math.min(u1, Math.min(u2, u3));
    	int tens = Math.min(t1, Math.min(t2, t3));
    	int hundred = Math.min(h1, Math.min(h2, h3));
    	int max = 0;
    	int[] digits = {u1,t1,h1,u2,t2,h2,u3,t3,h3};
    	for(int i=0;i<digits.length;i++){
    		if(digits[i] > max)
    			max = digits[i];
    	}
    	int pin = max*1000 + hundred*100 + tens*10 + unit;
    	System.out.println("PIN = " + pin);
    	sc.close();}}