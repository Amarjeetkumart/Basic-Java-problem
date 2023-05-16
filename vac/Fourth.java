package vac;
import java.util.*;
public class Fourth {
/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year's of service-");
		int y= sc.nextInt();
		System.out.println("Enter your salary-");
		float s= sc.nextInt();
		if (y>5) {
			float b=s+(s/20);
			System.out.println("Now your salary will Become- "+b);
		}
		else {
			System.out.println("Right now you are not eligible for Bonus.");
		}
	}
}
