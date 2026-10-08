import java.util.Scanner;
class Zero_Present{
    public static boolean NonZeroRow(int r, int[][] array2D){
        for (int i = 0; i < array2D[r].length; i++){
            if (array2D[r][i] == 0){
                return false;
            }
        }
        return true;
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

        System.out.println("Enter row index: ");
        int r = sc.nextInt();

        boolean result = NonZeroRow(r, array2D);

        if (result){
            System.out.println("No zeroes present at row index " + r);
        }else{
            System.out.println("Row index " + r + " contains atleast 1 zero");
        }
    }
}