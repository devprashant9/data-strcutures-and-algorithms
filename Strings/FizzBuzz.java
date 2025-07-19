import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {
        int N = 15;
        fizzBuzz(N);
    }

    public static void fizzBuzz(int N) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        System.out.println("The Array is: " +list);
    }
}