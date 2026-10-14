import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SequenceMaintain{
    public static int missingNo(int[] arr, int n){
        Set<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        for (int i = 1; i <  n + 1; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Enter valid value");
        }

        System.out.println("Enter the values without missing number: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = missingNo(arr, n);

        if (result != -1){
            System.out.println("Missing number is: " + result);
        }else{
            System.out.println("No missing number found");
        }
    }
}