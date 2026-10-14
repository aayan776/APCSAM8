import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Find_Unique{
    public static int[] unique(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        for (int num : arr1){
            set.add(num);
        }

        for (int num : arr2){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set){
            result[index] = num;
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of array1: ");

        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter number of elements in array2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of array2: ");

        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        int[] result = unique(arr1, arr2);

        System.out.println("Unique values: ");
        for (int num : result){
            System.out.print(num + " ");
        }
    }
}