 // By recursion method
import java.util.Scanner;
public class LinearSearching3 {
    static int LinearSearch(int []arr,int idx,int target){
        if(idx== arr.length){
            return -1;         //Base Case
        }
        if(arr[idx]==target) return idx;
       return  LinearSearch(arr,idx+1,target);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element");
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the target value");
        int target= sc.nextInt();
        System.out.println();
        System.out.println(LinearSearch(arr,0,target));
    }
}
