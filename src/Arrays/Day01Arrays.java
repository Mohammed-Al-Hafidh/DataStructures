package Arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Day01Arrays {

	public static void main(String[] args) {		
		Scanner scanner=new Scanner(System.in);
		
		int arraySize=0;
		System.out.println("Please enter the size of the array");
		
		try {
			arraySize=scanner.nextInt();			
		} catch (Exception e) {						
			System.out.println("Array Size should be an integer");
			System.out.println("Ending the program");
			System.exit(0);
		}
		
		if(arraySize<=0) {
			System.out.println("Array size should be more that zero");
			System.out.println("Ending the program");
			System.exit(0);
		}
		
		int[] myArray = new int[arraySize];		
		for(int i=0;i<arraySize;i++) {
			// One Way
			myArray[i]=ThreadLocalRandom.current().nextInt(1, 100);
			// Second way
			//myArray[i]=(int)(Math.random()*100+1);
		}
		System.out.println("All numbers of the array\n");
		for(int i=0;i<arraySize;i++) {
			// One Way
//			if(i!=0) 
//				System.out.print(",");
//			System.out.print(myArray[i]);
			// Second Way
			System.out.printf("%s%d",i==0 ? "":",",myArray[i]);
		}
		boolean isFirst=true;
		System.out.println("\n\nShowing only prime numbers\n");		
		for(int i=0;i<arraySize;i++) {			
			if(isPrime(myArray[i])) {
				if(myArray[i]!=1) {					
				System.out.printf("%s%d",isFirst ? "":",",myArray[i]);
				isFirst=false;
				}
			}									 			
		}
		scanner.close();
	}
	
	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) { 
				// number is perfectly divisible - no prime 
				return false;
			}
		} 
				return true;
	}
			
}
