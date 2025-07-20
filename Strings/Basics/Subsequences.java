package Strings.Basics;

public class Subsequences {

    public static void main(String[] args) {
        String str = "ABC";
        generateSusequences(str, "", 0);
    }

    public static void generateSusequences(String str, String sequence, int index) {
        if (index == str.length()) {
            System.out.println(sequence);
            return;
        }

        generateSusequences(str, sequence + str.charAt(index), index + 1);
        generateSusequences(str, sequence, index + 1);
    }
    }
