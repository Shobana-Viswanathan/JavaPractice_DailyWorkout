package com.hands_on_ControlFlow;
import java.util.Scanner;
public class Festival_Discount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double tot=0;
		if(a<2000) {
			tot=(a-(a*0.05));
		}
		else if(a>=2000 && a<5000){
			tot=(a-(a*0.25));
		}
		else if(a>=5000 && a<10000){
			tot=(a-(a*0.35));
		}
		else {
			tot=(a-(a*0.50));
		}
		System.out.println(tot+" ");
		sc.close();
	}

}
