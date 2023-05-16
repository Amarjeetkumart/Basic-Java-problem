package vac;
import java.util.*;
public class Tenth {
/*
 * Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:- ");
		int a=sc.nextInt();
		System.out.println("Enter Sex (M/F):-");
		char s=sc.next().charAt(0);
		System.out.println("Marital status (Y/N):-");
		char m=sc.next().charAt(0);
		
		if (s=='F') {
			System.out.println("Work only in urban areas");
		}
		else if (s=='M' && a>20 && a<40) {
			System.out.println("Work anywhere");
		}
		else if (s=='M' && a>40 && a<60) {
			System.out.println("Work urban areas only.");
		}
		else {
			System.out.println("ERROR");
		}
	}
}
