import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] row1 = new float[]{0,1,3,4,5,6};
		float[] row2 = new float[]{0,0,1,5,6,1};
		float[] row3 = new float[]{1,4,0,6,1,2};
		float[] row4 = new float[]{1,5,6,1,2,3};
		float[] row5 = new float[]{0,0,0,1,3,4};
		float[] row6 = new float[]{1,1,2,3,4,5};
		float[][] array = new float[][]{row1,row2,row3,row4,row5,row6};
		Matrix matrix= new Matrix(array);
		matrix = matrix.rowReduce();
		matrix.display();
	}

}
