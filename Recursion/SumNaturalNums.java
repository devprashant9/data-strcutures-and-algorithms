public class SumNaturaNums {

    public static void main(String[] args) {
        int res = sumNaturalNums(10);
        System.out.println("Sum is: " +res);
    }

    public static int sumNaturalNums(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumNaturalNums(n - 1);
    }
}