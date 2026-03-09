package com.hands_on_ControlFlow;
import java.util.Scanner;
public class employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter wages: ");
		int wages=sc.nextInt();
		System.out.println("Enter number of days: ");
		int days=sc.nextInt();
		int res=wages*days;
		System.out.println("Total Salary:"+res);

	}
}
