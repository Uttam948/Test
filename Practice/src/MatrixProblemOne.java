
public class MatrixProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		MatrixDFS(arr);		

	}
	
	public static void MatrixDFS(int mat[][]) {
		
		for(int i =0;i<mat.length ; i++) {
			
			for(int j =0;j<mat.length;j++) {
				
				if(i == 0 && (j == 1 || j== 2)) {
					mat[i][j] = 1;
				}
				else if(i == 1 && j == 0 ) {
					mat[i][j] = 1;
				}
				else if(i == 2 && (j == 1 || j==2)) {
					mat[i][j] = 1;
				}else {
					mat[i][j] = 0;
				}
			}
		}
		
		for(int i =0 ; i<mat.length ; i++) {
			for(int j =0 ; j<mat.length ; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
