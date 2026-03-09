package com.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ReadMoreInput {
	public static void main(String[]args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Movie ID : ");
		int movieid=sc.nextInt();
		sc.nextLine();// consume newLine;
		System.out.println("Enter Movie Name :");
		String name=sc.nextLine();
		System.out.println("Enter Movie Description :");
		String des=sc.nextLine();
		System.out.println("Enter Movie Language :");
		String lang=sc.next();
		System.out.println("Enter Movie Genre :");
		String genre=sc.next();
		System.out.println("Enter Movie release date(dd/mm/yy)");
		String date=sc.next();
		SimpleDateFormat mdate=new SimpleDateFormat("dd/MM/yyyy");
		Date moviedate=mdate.parse(date);
		
		System.out.println("Enter Movie Seat Cost :");
		float seat=sc.nextFloat();
		System.out.println("ENTERED MOVIE DETAILS ARE");
		System.out.println("MOVIE ID :"+movieid);
		System.out.println("Movie Name :"+name);
		System.out.println("Movie Description :"+des);
		System.out.println("Movie Language :"+lang);
		System.out.println("Movie Genre :"+genre);
		System.out.println("Movie Date :"+moviedate);
		System.out.println("Movie Action :"+seat);
		sc.close();
	}

}
