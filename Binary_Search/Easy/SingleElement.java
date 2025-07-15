package Binary_Search.Easy;

public class SingleElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        singleElement(arr);
    }

    public static void singleElement(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            System.out.println("Single Element: " + arr[0]);
            return;
        }

        if (arr[0] != arr[1]) {
            System.out.println("Single Element: " + arr[0]);
            return;
        }

        if (arr[n - 1] != arr[n - 2]) {
            System.out.println("Single Element: " + arr[n - 1]);
            return;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                System.out.println("Single Element: " + arr[mid]);
                return;
            }

            // if mid is even and same as next OR if mid is odd and same as previous, move right
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
                (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
