public class InsertionSorting {
    static void InsertionSort(int []arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int element=arr[i];
            int j;
            for(j=i-1;j>=0;j--) {
                if (arr[j] > element) {  //
                    arr[j + 1] = arr[j];   // shifting the array element
                } else {
                    break;
                }
            }
            arr[j + 1]=element;
            }
        }
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        InsertionSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
