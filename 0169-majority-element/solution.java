class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=s.majorityElement(nums);
        System.out.print(k);
    }
}
