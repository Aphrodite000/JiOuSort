import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        //偶数在前，奇数在后
        int i=0;
        int j=A.length-1;
        //奇数
        while(i<j){
            if(A[i]%2!=0&&A[j]%2==0){
                swap(A,i,j);
                i++;
                j--;
            }
            if(A[j]%2!=0){
                j--;
            }
            if(A[i]%2==0){
                i++;
            }
        }
        return A;
    }
    public void swap(int[] A,int i,int j){
        int a;
        a=A[i];
        A[i]=A[j];
        A[j]=a;
    }
}
