class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid;
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,k=0;
        int[] arr = new int[n+m];
        while(i<n & j<m){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        if((m+n)%2==0){
            double val1 = arr[(m+n)/2];
            double val2 = arr[((m+n)/2)-1];
            System.out.println(val2);
            mid = (val1 + val2)/2;
        }
        else{
            mid = arr[(m+n)/2];
        }
        return mid;
    }
}
