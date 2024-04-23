import java.util.Scanner;
public class LinearSearch2 {

    static int LinearSearching(int []arr,int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                return i;
            }
        }
  return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        System.out.println();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the target number");
        int number = sc.nextInt();
        System.out.println();
        System.out.println(LinearSearching(arr,number));
    }

}
