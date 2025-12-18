import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=s.removeDuplicates(nums);
        System.out.print(k+", nums = [");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print("]");
    }
}
