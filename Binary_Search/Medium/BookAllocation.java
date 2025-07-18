package Binary_Search.Medium;

public class BookAllocation {

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int N = 4;
        allocateBooks(arr, N);
    }

    public static void allocateBooks(int[] arr, int N) {
        int ans = -1;
         if (N > arr.length) {
            System.out.println("Not Possible");
         } else {
            int low = 49;
            int high = 172;
            int mid = 0;
            

            while (low <= high) {
                mid = (low + high) / 2;
                int students = pageAllocated(arr, mid);
                if(students > N) {
                    low = mid + 1;
                    ans = low;
                } else {
                    high = mid - 1;
                }
            }
         }
         System.out.println("The Answer is: " +ans);
    }

    public static int pageAllocated(int[] arr, int mid) {
        int students = 1;
        int pageStudent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pageStudent + arr[i] <= mid) {
                pageStudent += arr[i];
            } else {
                students += 1;
                pageStudent = arr[i];
            }
        }
        return students;
    }
}