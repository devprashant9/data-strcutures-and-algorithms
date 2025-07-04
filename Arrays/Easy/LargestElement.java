class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 70, 40, 70, 80, 90, 60, 80};
        largestElement(arr);
    }

    // Brute Force: Sort and Find
    // Imp Edge Case: Repeating Numbers

    public static void largestElement(int[] arr) {
        int largest = arr[i];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Number in Array is: " +largest);
    }
}

// TC => O(N)
// SC => O(1)