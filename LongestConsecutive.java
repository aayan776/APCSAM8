import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutive{
    public static int longestSequence(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        int maxLen = 0;
        for (int num : arr){
            int length = 1;
            if (!set.contains(num - 1)){
                int currentnum = num;

                while (set.contains(num + 1)){
                    length++;
                    currentnum++;
                }
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = longestSequence(arr);

        System.out.println("Length of longest consecutive sequence = " + result);
    }
}