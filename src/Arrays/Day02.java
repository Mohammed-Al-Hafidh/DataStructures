package Arrays;

import java.util.Arrays;

public class Day02 {

	static int getIfExists(int[][] data, int row, int col) {
	     // If exists, return the element, otherwise return 0
	     if(data.length<row)
	    	 return 0;
	     for(int i=0;i<data.length;i++)
	    	 if(data[i].length<col)
	    		 return 0;
	     return data[row][col];
   }

   static int sumOfCross(int[][] data, int row, int col) {
	    // return sum of the element at row/col
       // plus (if they exist) element above, below, to the left and right of it
	   int sumRow=0;
	   int sumCol=0;
	   for(int i=0;i<data[row].length;i++)
		   sumRow+=data[row][i];
	   for(int i=0;i<data.length;i++)/////problem
		   sumCol+=data[i][col];
	   return sumRow+sumCol;
   }
   
	// useful helper for debugging
	static void print2D(int[][] data) { 
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++) {			
				System.out.printf("%4d%3s",data[i][j],j==data[i].length-1? "":","); 				
			}
			System.out.println("\n");
		}
	}
	
	// duplicate a jagged array
	static int[][] duplicateEmptyArray2D(int[][] orig2d) {
		int[][] duplicate2d=new int[orig2d.length][];
		
		for(int i=0;i<orig2d.length;i++)		
			for(int j=0;j<orig2d[i].length;j++)
				duplicate2d[i][j]=orig2d[i][j];
		return duplicate2d;
		}	
	
   public static void main(String[] args) {
       int[][] data2D = {
           {1, 3, 6, 8},
           {7, 1, 2, 3},
           {8, 3, 2, 1},
           {1, 7, 1, 9},
       };
       System.out.println(findSmallestSum(data2D));
       
       print2D(data2D);
       System.out.println();
       print2D(newCrossSumArray(data2D));
   }
   
   static int findSmallestSum(int[][] data) {
	   int countNumbers=data.length*data[0].length;
	   int[] sums=new int[countNumbers]; 
	   
	   
	   
	  int c=0; 	   
		   for(int i=0;i<data.length;i++)			   
				for(int j=0;j<data[i].length;j++)
				{
					sums[c]=sumOfCross(data, i, j);
					c++;
				}	   	 
	   Arrays.sort(sums);
	   return sums[0];	   				
   }
   
   static int[][] newCrossSumArray(int[][] data){
	   int[][] data2Dsums =new int[data.length][data[0].length];
	   for(int i=0;i<data.length;i++)			   
			for(int j=0;j<data[i].length;j++)
			{
				data2Dsums[i][j]=sumOfCross(data, i, j);
			}
	   return data2Dsums;
   }
   
      
}
