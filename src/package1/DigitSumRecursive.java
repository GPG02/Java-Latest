package package1;

public class DigitSumRecursive {
    public static void main(String[] args) {
        int number = 1947;
        int sum = calculateDigitSum(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    public static int calculateDigitSum(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + calculateDigitSum(num / 10);
        }
    }
}
