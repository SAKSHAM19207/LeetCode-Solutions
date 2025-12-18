class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[m+n];
        int j=0;
        for(int i=0;i<m;i++){
            temp[j]=nums1[i];
            j++;
        }
        for(int i=0;i<n;i++){
            temp[j]=nums2[i];
            j++;
        }
        Arrays.sort(temp);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}
