import java.util.Scanner;
class Substring{
    public static int[] subArray(int[] arr, int startIndex, int endIndex){
        int length = endIndex - startIndex + 1;
        int[] result = new int[length];

        for (int i = startIndex; i <= endIndex; i++){
            result[i - startIndex] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Enter start index:");
        int start = sc.nextInt();

        System.out.println("Enter end index:");
        int end = sc.nextInt();

        int[] result = subArray(arr, start, end);

        System.out.println("Substring: ");
        for (int num : result){
            System.out.print(num + " ");
        }
    }
}