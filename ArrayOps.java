public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for(int i = 0; i<arr.length; i++) {
      sum+=arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr) {
    int large = -1000000;
    for(int i = 0; i<arr.length; i++) {
      if(arr[i]> large) {
        large = arr[i];
      }
    }
    return large;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] sumRow = new int[matrix.length];
    for(int i = 0; i<sumRow.length; i++) {
      sumRow[i] = sum(matrix[i]);
    }
    return sumRow;
  }
  public static  int[] largestInRows(int[][] matrix) {
    int[] largeRow = new int[matrix.length];
    for(int i = 0; i<matrix.length; i++) {
      largeRow[i] = largest(matrix[i]);
    }
    return largeRow;
  }
  public static  int sum(int[][] arr) {
    int arrSum = 0;
    for(int i = 0; i<arr.length; i++) {
      arrSum += sum(arr[i]);
    }
    return arrSum;
  }
  public static int sumCol(int[][] matrix, int col) {
    int colSum = 0;
    for(int i =0; i<matrix.length; i++) {
      colSum+= matrix[i][col];
    }
    return colSum;
  }
}
