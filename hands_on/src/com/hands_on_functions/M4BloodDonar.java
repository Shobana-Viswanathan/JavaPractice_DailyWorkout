/**
 * This program checks whether a person is eligible
 * to donate blood based on given rules:
 * Age > 18 and Age <= 55
 * Weight > 45 kg
 */
package com.hands_on_functions;
import java.util.Scanner;
public class M4BloodDonar {
static void find(int age,int weight) {
	if(age>18 && age<=55 && weight>45) {
		System.out.println("Blood donar is eligible");
	}
	else {
		System.out.println("Not eligible to donate the blood");
	}
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    int weight=sc.nextInt();
    find(age,weight);
    sc.close();
	}}


