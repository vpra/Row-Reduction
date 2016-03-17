import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns");
		int columns = scan.nextInt();
		System.out.println("Enter numbers row by row");
		float[][] array = new float[rows][columns];
		for(int x = 0; x<rows; x++){
			for(int y = 0; y<columns; y++){
				float input = scan.nextFloat();
				array[x][y] = input;
			}
		}
		Matrix matrix= new Matrix(array);
		matrix = matrix.rowReduce();
		matrix.display();
	}

}

