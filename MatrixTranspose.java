public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4},
                          {5, 6, 4}};
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++){
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose Matrix : ");

        for (int i = 0 ; i < transposeMatrix.length; i++){
            for (int j = 0 ; j< transposeMatrix[i].length; j++){
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
