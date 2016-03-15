public class Matrix{

  private int rows;
  private int columns;
  private int[][] matrix;
  
  public Matrix(int[][] m){
    rows = m.length;
    columns = m[0].length;
    matrix = new int[rows][columns]; 
    for(int i=0; i<matrix.length; i++)
      for(int j=0; j<matrix[i].length; j++)
        this.matrix[i][j] = m[i][j]; 
  }

  public int[] getRow(int n){
    if(n>=rows || n<0) 
      throw new IndexOutOfBoundsException();
    else
      return matrix[n];
  }
  
  public void display(){
    for(int i=0; i<rows; i++){
      for(int j=0; j<columns; j++)
        System.out.print(matrix[i][j]+" ");
      System.out.print("\n");
    }
  }

  public int rank(int[] row){
    int rank=0;
    for(int i=0; i<columns; i++){
      if(row[i]!=0)
        break;
      else
        rank++;
    }
  }
  private void forwardPhase(){
    
  }
}
