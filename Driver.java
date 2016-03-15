import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
    int[][] test = new int[][]{
      {1,2,3},
      {2,3,1},
      {3,1,2}};

    Matrix m = new Matrix(test);
    for(int i: m.getRow(1))
      System.out.println(i);
  }
}
