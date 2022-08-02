
public class MultidimensionalArray {

	public static void main(String[] args) {
		
		
		//2D array
		int[][] a =  {
				{1, 2, 3},
				{4, 5, 6, 7},
				{8},
	};
		
		System.out.println("Length of row 1: " + a[0].length);
		System.out.println("Length of row 2: " + a[1].length);
		System.out.println("Length of row 3: " + a[2].length + "\n");
	
		//print 2D array using loop
		int[][] b = {
				{1, 2, 3},
				{4, 5, 6, 7},
				{8},
		};
		
			for(int i = 0; i < b.length; i++) {
				for(int j = 0; j < b[i].length; j++) {
						System.out.println("2D Array using Loop: " + b[i][j]);
				}
			}
			
		//3D array
		int[][][] test = {
				{
					{1, 2, 3,},
					{2, 3, 4}
				},
				{
					{-4, -5, 6, 9},
					{1},
					{2, 3}
				}
		};
		

		System.out.println("\nLength of row 1: " + test[0].length);
		System.out.println("Length of row 2: " + test[1].length);
		
		//using for each loop
		for(int[][] array2D: test) {
			for(int[] array1D: array2D) {
				for(int item: array1D) {
					System.out.println("Using for each loop: " + item);
				}
			}
		}
	}

}
