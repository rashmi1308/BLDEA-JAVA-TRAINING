package com.bldea.crorepathiapp;

import java.util.Scanner;

public class CrorepathiApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("Lets welcome our first candidate");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your city?");
		String city = sc.next();
		System.out.println("What is your state?");
		String state = sc.next();
		
		candidate c1 = new candidate(name,age,city,state);
		candidate c2 = new candidate(name,age,city,state);
		candidate c3 = new candidate(name,age,city,state);
		candidate c4 = new candidate(name,age,city,state);
		candidate c5 = new candidate(name,age,city,state);
		candidate c6 = new candidate(name,age,city,state);
		
		System.out.println("Congratulations for making it till here Mr/Mrs. "+c1.getName());
		System.out.println("The rules of the game:");
		System.out.println("1.There will be 10 questions which rewards a specific amount in"
				+ "incremental order");
		System.out.println("2.The game will contain 3 life lines."
				+ "(audiance phone,50-50 and skip the question");
		System.out.println("3. you can quit the game at any stage.");
		System.out.println("Pleas type 1 if you wish to see the reward per question ");
		int type_1 = sc.nextInt();
		if(type_1==1){
			System.out.println("Question-1 : 1000\n"+
		                       "Question-2 : 5000\n"+
					           "Question-3 : 10000\n"+
		                       "Question-4 : 20000\n"+
					           "Question-5 : 40000\n"+
					           "Question-6 : 50000\n"+
					           "Question-7 : 60000\n"+
					           "Question-8 : 70000\n"+
					           "Question-9 : 80000\n"+
					           "Question-10: 90000\n");
			System.out.println("Do you wish to continue??(type: YES/NO)");
	 }
		else {
			System.out.println("Do you wish to continue??(type: YES/NO)");
		}
		String type_2 = sc.next();
		
		if(type_2.equalsIgnoreCase("yes")==true) {
			System.out.println("Lets begin the Game");
			System.out.println("Here is the first question.");
			boolean res1 = Questions.fetchQuestions1(c1.getName());
			if(res1==true) {
				System.out.println("Congratulations!!Your Answer is correct.\n"+"You have won Rs."+c1.getAmount());
				System.out.println("Sorry!! Your answer is incorrect");
				boolean res2 = Questions.fetchQuestions2(c2.getName());
				if(res2==true) {
					System.out.println("Congratulations!!Your Answer is correct.\n"+"You have won Rs."+c2.getAmount());
					System.out.println("Here is your next questions.");
					boolean res3 = Questions.fetchQuestions3(c3.getName());
					if(res3==true) {
						System.out.println("Congratulations!!Your Answer is correct.\n"+"You have won Rs."+c3.getAmount());
						System.out.println("Here is your next questions.");
						boolean res4 = Questions.fetchQuestions4(c4.getName());
						if(res4==true) {
							System.out.println("Congratulations!!Your Answer is correct.\n"+"You have won Rs."+c4.getAmount());
							System.out.println("Here is your next questions.");
							boolean res5 = Questions.fetchQuestions5(c5.getName());
							if(res5==true) {
								System.out.println("Congratulations!!Your Answer is correct.\n"+"You have won Rs."+c5.getAmount());
								System.out.println("Here is your next questions.");
								boolean res6 = Questions.fetchQuestions6(c6.getName());
							}
						else {
						System.out.println("We are sorry!! Your Answer is incorrect.\n" +"You have won Rs."+c1.getAmount());
					}
						}
						else {
							System.out.println("We are sorry!! Your Answer is incorrect.\n" +"You have won Rs."+c1.getAmount());
						}
							}
					else {
						System.out.println("We are sorry!! Your Answer is incorrect.\n" +"You have won Rs."+c1.getAmount());
					}
						}
				else {
					System.out.println("We are sorry!! Your Answer is incorrect.\n" +"You have won Rs."+c1.getAmount());
				}
					}
			else {
				System.out.println("We are sorry!! Your Answer is incorrect.\n" +"You have won Rs."+c1.getAmount());
			}
				}
		else {
			System.out.println("We are sorry!! Your Answer is incorrect.\n" +"You have won Rs."+c1.getAmount());
		}
			}
}