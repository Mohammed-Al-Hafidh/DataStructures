package Arrays;

public class Array2D {

	public static void main(String[] args) {
//		int[][] int2DArray=new int[3][5];		
//		int2DArray[2][4]=10;
		
		int[][] arr= {{1,2,3},{3,4},{5,6,7,8}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}		
			System.out.println("\n");
		}
	}
}
