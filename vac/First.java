package vac;
import java.util.*;
public class First {
	public static void main(String[] args) {
/*Take values of length and breadth of a rectangle
 *   from user and check if it is square or not.
 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:-");
		int l=sc.nextInt();
		System.out.println("Enter breadth:-");
		int b=sc.nextInt();
		
		if (l==b){
    System.out.println("it is a square.");
		}
		else {
			System.out.println("it is a rectangle.");
		}
		
	}
}