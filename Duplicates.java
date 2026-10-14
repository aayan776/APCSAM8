import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Duplicates{
    public static int[] findDuplicate(int[] arr){
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : arr){
            if (!unique.add(num)){
                duplicate.add(num);
            }
        }

        int[] result = new int[duplicate.size()];
        int index = 0;

        for (int num : duplicate){
            result[index] = num;
            index++;
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

        int[] result = findDuplicate(arr);

        if (result.length > 0){
            System.out.println("Duplicates found:");
            for (int num : result){
                System.out.print(num + " ");
            }
        }else{
            System.out.println("No duplicates");
        }
    }
}