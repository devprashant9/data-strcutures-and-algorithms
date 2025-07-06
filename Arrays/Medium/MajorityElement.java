package Arrays.Medium;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        majorityElement(arr);
    }

    public static void majorityElement(int[] arr) {
        int count = 0;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                maxElement = arr[i];
                count = 1;
            } else if(arr[i] == maxElement) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        
        int verifyCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxElement == arr[i]) {
                verifyCount += 1;
            }
        }

        if (verifyCount > arr.length / 2) {
            System.out.println("Max Element is: " +maxElement);
        } else {
            System.out.println("No Max Element Present");
        }
    }
}