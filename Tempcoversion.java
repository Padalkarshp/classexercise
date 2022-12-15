package excercise1;

import java.util.Scanner;

public class Tempcoversion {
	
	    public static void main(String args[]) {
	        double celsius, fahren;
	        Scanner scanner;
	        scanner = new Scanner(System.in);
	        System.out.println("Enter Temperature in Celsius");
	        celsius = scanner.nextFloat();
	 
	        fahren = (9.0 / 5.0) * celsius + 32;
	 
	        System.out.print("Temperature in Fahrenheit = " + fahren);
	    }
}