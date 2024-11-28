import java.util.Arrays;

public class RowSums {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		// Get the sums of the rows
        int[] rowSums = SumRows(a);

        // Print the original array
        System.out.println("Original 2D array:");
        for (int[] row : a) {
            System.out.println(Arrays.toString(row));
        }

        // Print the row sums
        System.out.println("Row sums: " + Arrays.toString(rowSums));
    }
/**********************************************************************************************/
/**method to return a sum of each row(inner) in the array and to give the sum back in 1D array**/
	/******************************************************************************************/
	public static int[] SumRows(int [][]array) {
		int rows=array.length;
		int [] sums =new int [rows];
		for(int i=0;i<array.length;i++) {
			for(int col=0;col<array[i].length;col++) {
				sums[i]+=array[i][col];
			}
			
		}
			
		return sums;
		
	}
}
