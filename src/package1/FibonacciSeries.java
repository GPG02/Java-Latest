package package1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int numberOfTerms = 10; // Specify the number of terms for the Fibonacci series
        System.out.println("Fibonacci Series up to " + numberOfTerms + " terms:");
        printFibonacciSeries(numberOfTerms);
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}