package vac;

import java.util.Scanner;
public class Eighth {
/*
 * Modify the above question to allow student to sit if he/she has medical cause.
 *  Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes held- ");
		int c= sc.nextInt();
		System.out.println("Number of classes attended- ");
		int a= sc.nextInt();
		int p=(a*100)/c;
		System.out.println("percentage of class attende is- "+p);
		if (p>=75) {
			System.out.println("You are eligible for exam.");
		}
		else {
			System.out.println("Do you have any madical cause [y/n]-");
			char m= sc.next().charAt(0);
			if (m=='y') {
				System.out.println("You are eligible for exam.");
			}
			else {
			System.out.println("you are not eligible for exam.");
			}
		}
	}
}
