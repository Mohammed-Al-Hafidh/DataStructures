package FibCached;

public class FibCached {

	public static void main(String[] args) {
		
//		long preTimeold=System.currentTimeMillis();
//		  System.out.println("Value of 25th number in fibonacci series->"+fibonacciold(40));
//		  long postTimeold=System.currentTimeMillis();
//		  System.out.println("Time taken to compute in milliseconds->"+(postTimeold-preTimeold));
		  
		  
		  fibArray[0]=1;
		  fibArray[1]=1;
		  long preTime=System.currentTimeMillis();
		  System.out.println("Value of 25th number in Fibonacci series->"+fibonacci(99));
		  long postTime=System.currentTimeMillis();
		  System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));

	}
	public static long fibonacciold(long n) {
		  if(n==0 ){
		    return 0;
		  }else if(n==1){
		    return 1;
		  } else {
		    return fibonacciold(n - 1) + fibonacciold(n - 2);
		  }
		 }
	
	
	 public static long fibArray[]=new long[100];
	 
	 public static long fibonacci(long n){
	  long fibValue=0;
	  if(n==0 ){
	   return 0;
	  }else if(n==1){
	   return 1;
	   
	  }else if(fibArray[(int)n]!=0){
	   return fibArray[(int)n];
	  }else{
	   fibValue=fibonacci(n-1)+fibonacci(n-2);
	   fibArray[(int) n]=fibValue;
	   return fibValue;
	  }
	 }

}
