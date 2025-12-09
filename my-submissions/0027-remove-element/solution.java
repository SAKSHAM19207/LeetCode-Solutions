import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
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
        int val=sc.nextInt();
        int k=s.removeElement(nums,val);
        System.out.print(k+", nums = [");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print("]");
    }
}
