package vac;
import java.util.*;
public class Fifth {
/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks- ");
		int m= sc.nextInt();
		if (m<25) {
			System.out.println("Your Grade is- F");
		}
		else if (m>25 && m<45) {
			System.out.println("Your Grade is- E");
		}
		else if (m>45 && m<50) {
			System.out.println("Your Grade is- D");
		}
		else if (m>50 && m<60) {
			System.out.println("Your Grade is- C");
		}
		else if (m>60 && m<80) {
			System.out.println("Your Grade is- B");
		}
		else if (m>80 && m<=100){
			System.out.println("Your Grade is- A");
		}
	}
}
