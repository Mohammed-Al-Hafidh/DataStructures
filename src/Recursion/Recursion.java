package Recursion;

public class Recursion {

	public static void main(String[] args) {
		//System.out.println(fibo(10));
		//System.out.println(pow(2,4));
		//System.out.println(fact(4));
		//System.out.println(findStr("dfshisdhisdhihihisdhi"));
		//System.out.println(changeXY("asxdsyxxyysdx"));
		
		//System.out.println(power(2,4));
		//System.out.println(factorial(5));
		//System.out.println(changexy("axbxcxdx"));
		//System.out.println(findMyStr("hdihixxhicvdhsdhicc"));
		System.out.println(changePi("xpiy"));
		
	}

	private static int fibo(int n) {
		if(n==1)
			return 1;
		if(n==0)
			return 0;
		return fibo(n-1)+fibo(n-2);
	}
	
	private static int pow(int base,int n) {
		if(n==0)
			return 1;
		return base*pow(base,n-1);
		
	}
	private static int fact(int n) {
		if(n==1||n==0)
			return 1;
		return n*fact(n-1);
	}
	
	private static int findStr(String str) {
		if(str.length()<2)
			return 0;
		if(str.substring(0, 2).equals("hi"))
			return 1+findStr(str.substring(2));
		return findStr(str.substring(1));
	}
	private static String changeXY(String str) {		
		
		if(str.length()<1)
			return str;	
		
		if(str.charAt(0)=='x') {
			return 'y'+changeXY(str.substring(1));
		}
		return str.charAt(0)+changeXY(str.substring(1));
								
	}
	
	//////////////////////////////////////// TESTING
	private static int power(int base,int n) {
		if(n==0)
			return 1;
		if(n==1)
			return base;
		return base*power(base,n-1);
	}
	
	private static int factorial(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
	
	private static String changexy(String str) {
		if(str.length()==0)
			return str;
		if(str.charAt(0)=='x')
			return 'y'+changexy(str.substring(1));		
		return str.charAt(0)+changexy(str.substring(1));
		
	}
	private static int findMyStr(String str) {
		if(str.length()<2)
			return 0;
		if(str.charAt(0)=='h'&&str.charAt(1)=='i')
			return 1+findMyStr(str.substring(2));
		return findMyStr(str.substring(1));
	}
	
	private static String changePi(String str) {
		if(str.length()<2)
			return str;
		if(str.charAt(0)=='p'&&str.charAt(1)=='i')
			return "3.14"+changePi(str.substring(2));
		return str.charAt(0)+changePi(str.substring(1));
	}
	
	private static int count7(int n) {
		if(n==7)
			return 1;
		if(n<7)
			return 0;
		if(n%10==7)
			return 1+count7(n/10);
		return count7(n/10);						
	}
	
	public String repeatEnd(String str, int n) {		
		
		String newStr="";
		for(int i=0;i<n;i++)
			newStr+=str.substring(str.length()-n);
		return newStr;
		  
		  
	}
}


