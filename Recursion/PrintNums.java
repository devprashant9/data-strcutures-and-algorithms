public class PrintNums {
    public static void main(String args[]) {
        printNums(0);
    }

    public static void printNums(int n) {
        if(n == 10) {
            return;
        }
        System.out.println(n);
        printNums(n + 1);
    }
}