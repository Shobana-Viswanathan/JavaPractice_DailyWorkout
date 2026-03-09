package com.oops;
public class Theatre {
String theatreID;
String theatreName;
public void setTheatre(String id, String name) {
theatreID = id;
theatreName = name;
}
public void getTheatreDetails (){
System.out.println("------Theatre Detail------");
System.out.println("Theatre ID : "+theatreID);
System.out.println("Theatre Name : "+theatreName);
System.out.println("--------------------------");
}
public static void main(String[] args) {
Theatre T[] = new Theatre[3];
for(int i=0;i<T.length;i++) {
T[i] = new Theatre();
}
T[0].setTheatre("T4523", "INOX");
T[1].setTheatre("T4742", "SPI Cinemas");
T[2].setTheatre("T4965", "Metro City");
for(int i = 0;i<T.length;i++) {
T[i].getTheatreDetails();
}
}
}