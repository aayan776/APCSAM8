class FindEven{
    public static int[] findEven(int[] numbers){
        int[] evenNum = new int[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                int[] newEvenNum = new int[evenNum.length + 1];
                System.arraycopy(evenNum, 0, newEvenNum, 0, evenNum.length);

                newEvenNum[evenNum.length] = numbers[i];

                evenNum = newEvenNum;
            }
        }
        return evenNum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenNum = findEven(numbers);

        for (int num : evenNum){
            System.out.print(num + " ");
        }
    }
}