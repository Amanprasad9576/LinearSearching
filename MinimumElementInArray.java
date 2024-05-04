
import java.util.Scanner;
public class FindingMinimumElementInArray {
    static int MinimumElementInArray(int []arr){
        int min_index=arr[0];
    for(int i=0;i<arr.length;i++){
        if(min_index>arr[i]){
            min_index=arr[i];
        }
    }
        return min_index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        System.out.println();
        System.out.println("Enter the array element");
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result= MinimumElementInArray(arr);
        System.out.println(result);

    }
}
