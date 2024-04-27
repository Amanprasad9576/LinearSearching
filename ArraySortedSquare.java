public class SortedArraySquare {
            static int[] sortedSquares(int[] nums) {
                int n = nums.length;
                int[] ans = new int[n];
                int i = 0;
                int j = n - 1;
                int k=n-1;
                while (i < j) {
                    if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                        ans[k--] = nums[i] * nums[i];
                        i++;
                    } else if (Math.abs(nums[j]) > Math.abs(nums[i])) {
                        ans[k--] = nums[j] * nums[j];
                        j--;
                    } else {
                        ans[k--] = nums[i] * nums[i];
                        i++;
                    }
                }
                return ans;
            }
    public static void main(String[] args) {
     int []nums={-4,-1,0,3,10};
     int []result=sortedSquares(nums);
     for(int i=0;i< nums.length;i++){
         System.out.println(result[i]);
     }
    }
}
