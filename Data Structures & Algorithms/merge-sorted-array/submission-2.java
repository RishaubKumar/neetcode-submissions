class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0,j =0,k=0;
        int arr[] = new int[m+n];
        while(j<n && i<m){
                if(nums1[i]>nums2[j]){
                    arr[k] = nums2[j];
                    k++;
                    j++;
                }else{
                    arr[k] = nums1[i];
                    i++;
                    k++;
                }
        }
        while(i<m){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        for(int l =0;l<arr.length;l++){
            nums1[l] = arr[l];
        }
    }
}