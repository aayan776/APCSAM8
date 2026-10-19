import java.util.ArrayList;
import java.util.Scanner;
class Factors{
    public static ArrayList<Integer> factor(int num){
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        ArrayList<Integer> factors = factor(n);

        System.out.println("Factors of " + n + " are: " + factors);
    }
}