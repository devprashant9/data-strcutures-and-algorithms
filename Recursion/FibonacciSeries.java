public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        printFibonacciSeries1(0, 1, 0);
        int res = printFibonacciSeries2(5);
        System.out.println("\nThe n-th Term is: " +res);
    }

    // printing fibonacci upto nth terms
    public static void printFibonacciSeries1(int first, int second, int terms) {
        if(terms == 7) {
            return;
        }
        int sum = first + second;
        System.out.print(sum + " ");
        printFibonacciSeries1(second, sum, terms + 1);
    }

    // finding n-th fibonacci terms
    public static int printFibonacciSeries2(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return printFibonacciSeries2(n - 1) + printFibonacciSeries2(n - 2);
    }
}

// Series: 0 1 1 2 3 5 8 13 21 . . .