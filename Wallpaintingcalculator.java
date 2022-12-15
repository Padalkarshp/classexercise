package excercise1;

import java.util.Scanner;

public class Wallpaintingcalculator {
	 public static void main(String[] args) {
		 {
		        int length, width, numberOfDoors, numberOfWindows;
		        double height;
		        
		        Scanner console = new Scanner(System.in);

		        System.out.print("Enter length: ");
		        length = console.nextInt();
		 
		        System.out.print("Enter width: ");
		        width = console.nextInt();
		        
		        System.out.print("Enter height: ");
		        height = console.nextDouble();
		        
		        System.out.print("Enter number of doors: ");
		        numberOfDoors = console.nextInt();
		        
		        System.out.print("Enter number of windows: ");
		        numberOfWindows = console.nextInt();

		        double totalSurfaceArea = 2 * (length * width + length
		                * height + width * height);

		        int areaOfFloor = length * width;
		        
		        int areaOfDoors = 20 * numberOfDoors;
		        
		        int areaOfWindows = 15 * numberOfWindows;
		        
		        double totalPaintArea = totalSurfaceArea - areaOfFloor
		                - areaOfDoors - areaOfWindows;
		        
		        double requiredPaint = totalPaintArea / 350;

		        System.out.println("Paint required "
		                + requiredPaint + " gallons.");
		      }
		      
		     
	 }
}
