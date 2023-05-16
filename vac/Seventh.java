package vac;
import java.util.*;
public class Seventh {
/*
 * A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
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
			System.out.println("you are not eligible for exam");
		}
	}
}
