package vac;
import java.util.*;
public class Nineth {
/*
 * Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000,
1900, 2100 then it must be divisible by 400.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:- ");
		int y=sc.nextInt();	
		int p=y%4;
		if (p==0) {
			System.out.println("Year is leap year.");
		}
		else {
			System.out.println("Year is not leap year.");
		}
	}
}
