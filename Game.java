package advt;


import java.util.Scanner;

public class Game {// class name is game 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[] = {1,2,3};
		System.out.println("Select the option");
		System.out.println("1.New Game");
		System.out.println("2.About");
		System.out.println("3.Exit");
		
		int option=sc.nextInt();
		switch(option) {
		case 1:{
			System.out.println("welcome to hangman");
			Hangman hg=new Hangman();
			hg.start();
			break;
		}
		case 2:{
			System.out.println("About Us");
			System.out.println("This project is created by Tejas Gowda");
			System.out.println(".......................................");
			System.out.println("for More details contact www.tejasgowda.com");
			break;
		}
		case 3:{
			System.out.println("thank you");
			break;
		}
		default:{
			System.out.println("You have selected wrong option");
			
		}
		}
	}
}
