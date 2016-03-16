public class Matrix{

  private int rows;
  private int columns;
  private float[][] matrix;
  
  public Matrix(float[][] m){
    rows = m.length;
    columns = m[0].length;
    matrix = new float[rows][columns]; 
    for(int i=0; i<matrix.length; i++)
      for(int j=0; j<matrix[i].length; j++)
        this.matrix[i][j] = m[i][j]; 
  }

  public float[] getRow(int n){
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
  public int rank(float[] row){
	    int rank=0;
	    for(int i=0; i<columns; i++){
	      if(row[i]!=0)
	        break;
	      else
	        rank++;
	    }
	    return rank;
	  }
  
  public void rankAndSort(){
	  int[] ranks = new int[rows];
	  for(int x = 0; x<rows; x++){
		  ranks[x]= rank(getRow(x));
	  }
	  for(int x = 0; x<rows;x++){
		  for(int y = x; y<rows; y++){
			  if(ranks[x]>ranks[y]){
				  swap(getRow(x),getRow(y));
				  int z = ranks[x];
				 ranks[x] = ranks[y];
				  ranks[y] = z;
			  }
		  }
	  }
  }
  

  //throw exc
  private void swap(float[] first, float[] second){
	  float[] transfer = new float[first.length];
	  for(int x = 0; x<first.length;x++){
		  transfer[x] = first[x];
	  }
	  for(int x = 0; x<first.length;x++){
		  first[x] = second[x];
	  }
	  for(int x = 0; x<first.length;x++){
		  second[x] = transfer[x];
	  }
	  
  }
  
  // Immutable
  private void scale(float[] base, float scale){
    for(int i=0; i<base.length; i++)
     base[i]=*scale;
  }

  //throw exc
  public void scaleAndAdd(float[] base, float scale,float[] row){
    if(base.length!=row.length)
      throw new IndexOutOfBoundsException();
    
    for(int i=0; i<base.length; i++)
      base[i] = base[i]*scale + row[i];
  }  
  
  private float non_zero(float[] row){
    for(int i=0; i<row.length; i++)
      if(row[i]!=0)
        return row[i];
    return -1;
  }

  // Forward phase of Gauss Jordan Elimination
  private void forwardPhase(){
      for(int i=0; i<rows; i++){
        float elem = non_zero(matrix[i]);
        if(elem==-1)
            return;
        else{
          matrix[i] = scale(matrix[i],elem);
          for(int j=i+1;j<rows;j++)
            
        }
      }
  }
  
  //Backward phase of Gauss Jordan Elimination
  private void backwardPhase(){
  }

  public Matrix rowReduce(){
  rankAndSort();
  forwardPhase();
  backwardPhase();

  return this;
  }
}
