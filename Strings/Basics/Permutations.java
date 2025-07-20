
class Permutations {

    public static void main(String[] args) {
        String str = "abc";
        generatePermutations(str);
    }

    public static void generatePermutations(String str) {
        permute(str.toCharArray(), 0);
    }

    private static void permute(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index); // fix character at index
            permute(arr, index + 1); // permute remaining
            swap(arr, i, index); // backtrack
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
