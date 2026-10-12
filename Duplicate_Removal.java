import java.util.Scanner;
class Duplicate_Removal{
    public static int[] removeDuplicate(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            boolean duplicate = false;
            for (int j = 0; j < index; j++){
                if (arr[i] == result[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate){
                result[index] = arr[i];
                index++;
            }
        }

        int[] trimmed = new int[index];
        for (int i = 0; i < index; i++){
            trimmed[i] = result[i];
        }
        return trimmed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = removeDuplicate(arr);

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}