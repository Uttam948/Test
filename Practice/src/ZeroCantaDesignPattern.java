

interface tictac{
	
	public void tictoac(int mat[][]);
}

class Tic implements tictac{

	@Override
	public void tictoac(int[][] mat) {
		// TODO Auto-generated method stub
		
	}
	
}

class Tac implements tictac{
	
	Tic tic;
	
	int mat[][] = new int[3][3];
	
	    Tac(int mat[][]){  
		this.mat = mat;
	   }

	@Override
	public void tictoac(int[][] mat) {
		// TODO Auto-generated method stub
		if(tic != null) {
			this.mat = mat;
		}
	}
	
}


public class ZeroCantaDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
