package Arrays.Hard;

public class SubArrayProduct {

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        subArrayProduct(arr);
    }

    public static void subArrayProduct(int[] arr) {
        int prefix = 1;
        int suffix = 1;
        int val = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }

            if(suffix == 0) {
                suffix = 1;
            }

            prefix *= arr[i];
            suffix *= arr[arr.length - 1 - i];
            val = Math.max(val, Math.max(prefix, suffix));
        }
        System.out.println(val);
    }
}