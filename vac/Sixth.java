package vac;
import java.util.*;
public class Sixth {
/*
 * Take input of age of 3 people by user and determine oldest and youngest among them.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Age of first person- ");
		int a= sc.nextInt();
		System.out.println("Age of second person");
		int b= sc.nextInt();
		System.out.println("Age of third person");
		int c= sc.nextInt();
		if (a>b && a>c) {
			System.out.println("First person is old");
		}
		else if(a>b && a<c) {
			System.out.println("Third person is old");
		}
		else if (a<b && b<c) {
			System.out.println("Third person is old");
		}
		else {
			System.out.println("Second person is old");
		}
		if (a<b && a<c) {
			System.out.println("First person is young");
		}
		else if(a<b && a>c) {
			System.out.println("Third person is young");
		}
		else if (a>b && b>c) {
			System.out.println("Third person is young");
		}
		else {
			System.out.println("Second person is young");
		}
	}
}
