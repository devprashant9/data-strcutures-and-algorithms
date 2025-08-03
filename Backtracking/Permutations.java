class Permutations{
    public static void generatePermutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(rem, ans + curr);
        }
    }
}