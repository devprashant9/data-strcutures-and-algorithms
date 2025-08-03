class Subsets {
    public static void generateSubset(String str, String ans, int index) {
        
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        generateSubset(str, ans + str.charAt(index), index + 1); 
        generateSubset(str, ans, index + 1);
    }
}
