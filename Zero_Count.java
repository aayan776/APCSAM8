import java.util.Scanner;
class Zero_Count{
    public static int NonZeroRow(int[][] array2D){
        int count = 0;
        for (int i = 0; i < array2D.length; i++){
            boolean isNonZero = true;
            for (int j = 0; j < array2D[i].length; j++){
                if (array2D[i][j] == 0){
                    isNonZero = false;
                    break;
                }
            }
            if (!isNonZero){
                count++;
            }
        }
        return count;
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

        int result = NonZeroRow(array2D);
        System.out.println("Number of rows with zero = " + result);
    }
}