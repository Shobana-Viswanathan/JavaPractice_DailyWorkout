package com.oops;

public class TheatreConstructor {
	String theatreID;
	String theatreName;
	TheatreConstructor(String tid, String tname){
	theatreID= tid;
	theatreName= tname;}
	public void getTheatreDetails(){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreID); 
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("--------------------------");
		} 

	public static void main(String[] args) {
		TheatreConstructor T = new TheatreConstructor("T4742","SPI Cinemas");      
		T.getTheatreDetails();   

	}

}
