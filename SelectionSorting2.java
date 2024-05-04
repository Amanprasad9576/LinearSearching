import java.util.Scanner;
public class SelectionSorting {
    static void Swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int MinimumElementInArray(int []arr ,int i){
        int min_Index=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min_Index]>arr[j]){
                min_Index=arr[j];
            }
        }
        return min_Index;
    }
    static void SelectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int min_value=MinimumElementInArray(arr,i);  //minimum value in unsorted array
            if(arr[i]!=min_value) {
                Swap(arr, i, min_value);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int []arr={5,4,3,2,1};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
