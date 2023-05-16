package vac;
import java.util.*;
public class Second {
	//Take two int values from user and print greatest among them.
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter first number- ");
   int a= sc.nextInt();
   System.out.print("Enter second number- ");
   int b= sc.nextInt();
   if (a>b) {
	   System.out.println("grater number is-" +a);
   }
   else {
	   System.out.println("grater number is-" +b);
   }
	}
}
