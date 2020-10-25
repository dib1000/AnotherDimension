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
}
