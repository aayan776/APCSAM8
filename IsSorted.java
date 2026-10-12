import java.util.Scanner;
class IsSorted{
    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = isSorted(arr);

        if (result){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is unsorted");
        }
    }
}