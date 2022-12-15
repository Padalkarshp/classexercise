	import java.util.Scanner;
public class Passfail {
		public static void main(String[] args) {
	        int marks;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the marks:");
	        marks = sc.nextInt();

	        if (marks >= 50) {
	            System.out.println("PASS");

	        } else {
	            System.out.println("FAILS");
	        }

	        System.out.println("Thank you");

	        sc.close();
	    }


		}


