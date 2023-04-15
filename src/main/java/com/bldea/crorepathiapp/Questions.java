package com.bldea.crorepathiapp;

import java.util.Scanner;

public class Questions {
	static String result;
	static int count_Life_Line=3;
    static Scanner sc=new Scanner(System.in);
	public static boolean fetchQuestions1(String name) {
	   System.out.println("1. Who is the founder of java?");
       System.out.println("a) Dennis Ritchie\n"+
	                      "b) Charles Babbage\n"+
    		              "c) Rahul Gandhi\n"+
	                      "d) Jmaes Gosling\n"+
    		              "e) Life Line");
       result = sc.next();
       if(result.equalsIgnoreCase("d")) {
    	   candidate.setAmount(1000);
    	   return true;
       }
       else if(result.equalsIgnoreCase("e)"){
    	   if(count_life_line)
       }
	}

	public static boolean fetchQuestions2(String name) {
		   System.out.println("2. Who is the father of computer?");
	       System.out.println("a) Dennis Ritchie\n"+
		                      "b) Charles Babbage\n"+
	    		              "c) Rahul Gandhi\n"+
		                      "d) Jmaes Gosling");
	       result = sc.next();
	       if(result.equalsIgnoreCase("b")) {
	    	   candidate.setAmount(5000);
	    	   return true;
	       }
	       return false;
		}
	public static boolean fetchQuestions3(String name) {
		   System.out.println("3. Who is the captain of RCB?");
	       System.out.println("a) Virat Kohli\n"+
		                      "b) Faf Duplesis\n"+
	    		              "c) Harshal Patel\n"+
		                      "d) Siraj");
	       result = sc.next();
	       if(result.equalsIgnoreCase("b")) {
	    	   candidate.setAmount(10000);
	    	   return true;
	       }
	  
	       public static boolean fetchQuestions4(String name) {
			   System.out.println("4. Who is the captain of CSK?");
		       System.out.println("a) Virat Kohli\n"+
			                      "b) Faf Duplesis\n"+
		    		              "c) MSD\n"+
			                      "d) Siraj");
		       result = sc.next();
		       if(result.equalsIgnoreCase("c")) {
		    	   candidate.setAmount(20000);
		    	   return true;
		       }
		       return false;
	       }
		       public static boolean fetchQuestions5(String name) {
				   System.out.println("5. Who is the capital of India?");
			       System.out.println("a) Dehli\n"+
				                      "b) Bijapur\n"+
			    		              "c) Bangalore\n"+
				                      "d) Mumbai");
			       result = sc.next();
			       if(result.equalsIgnoreCase("a")) {
			    	   candidate.setAmount(40000);
			    	   return true;
			       }
			       return false;
		       }
			       public static boolean fetchQuestions6(String name) {
					   System.out.println("6. Who is the Father of Nation");
				       System.out.println("a) Gandhiji\n"+
					                      "b) Rahul Gandhi\n"+
				    		              "c) Soniya\n"+
					                      "d) Pratibha Patil");
				       result = sc.next();
				       if(result.equalsIgnoreCase("a")) {
				    	   candidate.setAmount(50000);
				    	   return true;
				       }
				       return false;
		}
}
 