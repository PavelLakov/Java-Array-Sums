import java.util.Arrays;


	public class ColumnSumms {

	

		public static void main(String[] args) {
			int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
			
			// Get the sums of the rows
	        int[] rowSums = SumColun(a);

	        // Print the original array
	        System.out.println("Original 2D array:");
	        for (int[] row : a) {
	            System.out.println(Arrays.toString(row));
	        }

	        // Print the row sums
	        System.out.println("Row sums: " + Arrays.toString(rowSums));
		}
	/**********************************************************************************************/
	/**method to return a sum of each column(inner) in the array and to give the sum back in 1D array**/
		/******************************************************************************************/
		
		public static int[] SumColun(int [][]array) {
			int columns=array[0].length;
			int [] sums =new int [columns];
			
			for(int i=0;i<array.length;i++) {
				for(int col=0;col<columns;col++) {
					sums[col]+=array[i][col];
				}
				
			}
				
			return sums;
			
		}}
	
