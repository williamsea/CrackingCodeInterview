public class Ch1_7_SetZero {
	public static void main(String args[]) {
		int size = 5;
		int[][] matrix = new int[size][size];
//		int[][] setZero = new int[size][size];
		int k = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = k;
				k++;
			}
		}
		matrix[1][3] = 0;
		matrix[2][2] = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}

		// setZero = setZero(matrix);
		setZeroBetter(matrix);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	private static void setZeroBetter(int[][] m) {
		boolean[] row = new boolean[m.length];
		boolean[] col = new boolean[m.length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(row[i]||col[j]){//as long as one of them is true, set that value to 0
					//Very space efficient!!!
					m[i][j]=0;
				}
			}
		}

	}

	// private static int[][] setZero(int[][] m){
	//
	// int length = m.length;
	// int[][] flag = new int[length][length];
	// for(int i=0;i<length;i++){
	// for(int j=0;j<length;j++){
	// if (m[i][j] == 0){
	// flag[i][j] = 1;
	// }
	// else{
	// flag[i][j]=0;
	// }
	// }
	// }
	//
	// for(int i=0;i<length;i++){
	// for(int j=0;j<length;j++){
	// if(flag[i][j]==1){
	// for(int a=0; a<length;a++){
	// m[i][a]=0;
	// }
	//
	// for(int b=0;b<length;b++){
	// m[b][j]=0;
	// }
	// }
	// }
	// }
	//
	// return m;
	// }

}
