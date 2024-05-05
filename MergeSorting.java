public class MergeSorting {
    static int [] MergeSort(int []num1,int []num2){
        int n=num1.length;
        int m= num2.length;
        int []ans=new int [n+m];
        int k=0;
        int j=0;
        int i=0;
        while(i<n && j<m ) {
            if (num1[i] >=num2[j]) {
                ans[k] = num2[j];
                k++;
                j++;
            } else   {
                ans[k]=num1[i];
                i++;
                k++;
            }
        }
        while(i<n){
            ans[k++]=num1[i++];
        }
        while(j<m){
            ans[k++]=num2[j++];
        }
        return ans;
    }
    public static void main(String[] args) {
        int []num1={2,5,9};
        int [] num2={3,6,8,10,23};

        int []result=new int [num1.length+ num2.length];
        result=MergeSort(num1,num2);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

