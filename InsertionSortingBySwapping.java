public class InsertionSortingBySwapping {
    static void InsertSorting(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    //  while (j > 0 && arr[j-1] > arr[j]) {
                    int temp = arr[j - 1]; // swapping Method
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    // j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 2, 100, 90};
        InsertSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
