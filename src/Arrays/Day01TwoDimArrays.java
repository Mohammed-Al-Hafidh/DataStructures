package Arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Day01TwoDimArrays {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arrayWidth =0;
		int arrayHeight =0;
		
		try {
			System.out.println("Please enter the width of the array");
			arrayWidth=scanner.nextInt();	
			System.out.println("Please enter the height of the array");
			arrayHeight=scanner.nextInt();
		} catch (Exception e) {						
			System.out.println("Array Size should be an integer");
			System.out.println("Ending the program");
			System.exit(0);
		}
		if((arrayWidth<=0)||(arrayHeight<=0)) {
			System.out.println("Array size should be more that zero");
			System.out.println("Ending the program");
			System.exit(0);
		}
		
		int[][] my2DArray=new int[arrayHeight][arrayWidth];
		
		for(int i=0;i<my2DArray.length;i++)
			for(int j=0;j<my2DArray[i].length;j++) {
				my2DArray[i][j]=ThreadLocalRandom.current().nextInt(-99, 99);
			}
		
		for(int i=0;i<my2DArray.length;i++)
		{
			for(int j=0;j<my2DArray[i].length;j++) {			
				System.out.printf("%4d%3s",my2DArray[i][j],j==my2DArray[i].length-1? "":","); 				
			}
			System.out.println("\n");
		}
		
		// TODO: 1) Sum of all numbers in the array
		int sumArray=0;
		for(int i=0;i<my2DArray.length;i++)
			for(int j=0;j<my2DArray[i].length;j++) 
				sumArray+=my2DArray[i][j];
		System.out.println("The sum of all numbers in the array is: "+sumArray+"\n");
		
		// TODO: 2) Sum of each of the row of the array
		int sumRow=0;
		for(int i=0;i<my2DArray.length;i++) {
			for(int j=0;j<my2DArray[i].length;j++) {
			sumRow+=my2DArray[i][j];				
			}
			System.out.println("The sum of row number "+i+" is: "+sumRow);
			sumRow=0;
		}			 
		System.out.println("\n");
		// TODO: 3) Sum of each of the column of the array
		int sumColumn=0;
		for(int i=0;i<arrayWidth;i++) {
			for(int j=0;j<arrayHeight;j++) {
				sumColumn+=my2DArray[j][i];
			}
			System.out.println("The sum of Column number "+i+" is: "+sumColumn);
			sumColumn=0;
		}
		System.out.println("\n");
		// TODO: 4) Standard deviation of all numbers in the array 
		double mean=sumArray/(arrayHeight*arrayWidth);
		double sum=0;
		for(int i=0;i<arrayHeight;i++) {
			for(int j=0;j<arrayWidth;j++) {
				sum += Math.pow((my2DArray[i][j])-mean, 2);
			}
		}
		
		mean=sum/((arrayHeight*arrayWidth)-1);
		double deviation=Math.sqrt(mean);
		System.out.println("The standard deviation of all numbers is : "+deviation);
		System.out.println("\n");
		
		// TODO: 5) Find pairs of numbers in the array whose sum is a prime number and display those pairs and their sum.
		//			(assume that negative number is not a prime number)
		int number1=0;
		int number2=0;
		for(int i=0;i<arrayHeight;i++) {
			for(int j=0;j<arrayWidth;j++) {
				number1=my2DArray[i][j];
				if(number1<0)
					continue;
				
				for(int ii=0;ii<arrayHeight;ii++) {
					for(int jj=0;jj<arrayWidth;jj++) {
						if((i==ii)&&(j==jj))
							continue;
						number2=my2DArray[ii][jj];
						if(number2<0)
							continue;
						int sumTwoNumbers=number1+number2;
						if(isPrime(sumTwoNumbers)) {
							//System.out.printf("%s%d%s%d%s%d","The first number is: ",number1," The second number is: ",number2," The prime sum is: ",sumTwoNumbers);
							System.out.printf("%s%-3d%s%3d%s%-2d","(",number1,",",number2,")= ",sumTwoNumbers);
							System.out.println();
						}
					}
				}
				
			}
		}
		

		
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
