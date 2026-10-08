import java.util.Scanner;
class Max_Sum{
    public static int[] maxSum(int[][] array2D){
        int[] maxRow = array2D[0];
        int maxSum = 0;

        for (int i = 0; i < array2D.length; i++){
            int sum = 0;
            for (int j = 0; j < array2D[i].length; j++){
                sum += array2D[i][j];
            }
            if (sum > maxSum){
                maxRow = array2D[i];
            }
        }
        return maxRow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] array2D = new int[rows][cols];

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                array2D[i][j] = sc.nextInt();
            }
        }

        int[] result = maxSum(array2D);

        System.out.println("Row with maximum sum: ");
        for (int i = 0; i < cols; i++){
            System.out.print(result[i] + " ");
        }
    }
}