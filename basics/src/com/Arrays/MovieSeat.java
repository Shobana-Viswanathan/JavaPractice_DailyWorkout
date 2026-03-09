package com.Arrays;
public class MovieSeat {
	public static void main(String[] args) {
    String[][] seat=new String[][] {{"B","B","A","A","A"},{"A","A","A","B","B"},{"A","B","B","B","B"},{"B","A","A","B","A"}};
    int vipc=0,prec=0,regc=0,vipt=5,pret=10,regt=5;
    System.out.println("_MOVIE ARRANGEMENT...");
	for(int i=0;i<seat.length;i++) {
		if(i==0)
			System.out.println("---VIP SEATS---");
		else if(i==1)
			System.out.println("---PREMIUM SEATS---");
		else if(i==3)
			System.out.println("---REGULAR SEATS---");
		for(int j=0;j<seat[i].length;j++) {
			System.out.print(" "+seat[i][j]+"   ");
			if(i==0 && seat[i][j].equalsIgnoreCase("B"))
			vipc++;
			else if(i>0 && i<3 && seat[i][j].equalsIgnoreCase("B"))
			prec++;
			else if(i==3 && seat[i][j].equalsIgnoreCase("B"))
			regc++;
			
		}
		System.out.println();
	}
	System.out.println("--SEAT BOOKED DETAIL--");
	System.out.println("--VIP SEATS--");
	System.out.println("BOOKED: "+vipc+" AVAILABLE: "+(vipt-vipc)+" TOTAL: "+vipt);
	System.out.println("--PREMIUM SEATS--");
	System.out.println("BOOKED: "+prec+" AVAILABLE: "+(pret-prec)+" TOTAL: "+pret);
	System.out.println("--REGULAR SEATS--");
	System.out.println("BOOKED: "+regc+" AVAILABLE: "+(regt-regc)+" TOTAL: "+regt);
	
	}
	

}
