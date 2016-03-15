public class Matrix{

  private int rows;
  private int columns;
  private int[][] matrix;
  
  public Matrix(int[][] matrix){
    rows = matrix.length;
    columns = matrix[0].length;
    
    for(int i=0; i<rows; i++)
      for(int j=0; j<columns; j++)
        this.matrix[i][j] = matrix[i][j]; 
  }
}
