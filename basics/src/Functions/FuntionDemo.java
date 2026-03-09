/*
 * The FunctionDemo class implements an application that display the Movie details
 * using the user defined methods
 */
package Functions;
 
public class FuntionDemo {
	static void getMovieDetail(String moviename,String moviedes,int movieduration,String movielang,String movierelease,String moviecountry,String moviegenre) {
		System.out.println("Movie Title:" +moviename);
		System.out.println("Movie Description:"+moviedes);
		System.out.println("Movie Duration:"+movieduration);
		System.out.println("Movie Language:"+movielang);
		System.out.println("Movie Release Date"+movierelease);
		System.out.println("Movie Country:"+moviecountry);
		System.out.println("Movie Genre:"+moviegenre);
	}
	
	
	public static void main(String[] args) {
	String moviename="HELLO";
	String moviedes="Nice to watch";
	int movieduration=3;
	String movielang="Tamil";
	String movierelease="27/03/2024";
	String moviecountry="ABC";
	String moviegenre="ACTION";
	System.out.println("____MOVIE DETAILS_____");
	getMovieDetail(moviename,moviedes,movieduration,movielang,movierelease,moviecountry,moviegenre);
    System.out.println("----------------------------");
	}

}
