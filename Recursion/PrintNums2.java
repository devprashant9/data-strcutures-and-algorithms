public class PrintNums2 {
    public static void main(String[] args) {
        printNums2(1);
    }

    public static void printNums2(int n) {
        if(n == 10) {
            System.out.println(n);
            return;
        }
        printNums2(n + 1);
        System.out.println(n);
    }
}