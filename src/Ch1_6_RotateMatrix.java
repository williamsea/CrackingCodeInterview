public class Ch1_6_RotateMatrix {

	public static void main(String args[]) {
		int size = 5;
		int[][] matrix = new int[size][size];
		int[][] rotatedMatrix = new int[size][size];
		int k = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = k;
				k++;
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + "\t");// need to be " "
			}
			System.out.print("\n");
		}

		rotatedMatrix = rotateMatrix(matrix);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(rotatedMatrix[i][j] + "\t");// need to be " "
			}
			System.out.print("\n");
		}

//		for (int i = 0; i < size / 2; i++) {
//			System.out.println(i);
//		}
//
//		for (int i = 0; i < size / 2; ++i) {
//			System.out.println(i);
//		}
		//seems no difference
	}

	private static int[][] rotateMatrix(int[][] m) {

		int n = m.length;
		for (int layer = 0; layer < n / 2; layer++) {//layer needs only half N (length)
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				// save top
				int top = m[first][i];

				// left to top
				// top = left
				m[first][i] = m[last - offset][first];
				// left - top:
				// 4 0 - 0 0 
				// 3 0 - 0 1
				// 2 0 - 0 2
				// 1 0 - 0 3
				
				// 0 0 - 0 4 Not included since i<last(==4) = 0 1 2 3

				// bottom to left
				m[last - offset][first] = m[last][last - offset];

				// right to bottom
				m[last][last - offset] = m[i][last];

				// top to right
				m[i][last] = top;
				// top - right:
				// 0 0 - 0 4 
				// 0 1 - 1 4
				// 0 2 - 2 4
				// 0 3 - 3 4
				
				// 0 4 - 4 4 Not included since i=0 1 2 3

			}
		}

		return m;

	}

}

// Remarks:
// int[][] matrix =[[1, 2, 3], [4, 5, 6], [7, 8, 9]]; //cannot be achieved
// System.out.println(matrix); //cannot be achieved
