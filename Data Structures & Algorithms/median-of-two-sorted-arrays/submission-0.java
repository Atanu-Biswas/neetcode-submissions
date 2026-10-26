class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length+nums2.length;
        int half =total/2;
        boolean isEven = (total%2==0);

        int[] a=nums1;
        int[] b=nums2;
        if(nums1.length>nums2.length){
            b=nums1;
            a=nums2;
        }
        int left=0;
        int right=a.length-1;


        while(true){
            int i=Math.floorDiv(right+left , 2);
            int j=half-i-2;

            int aleft = (i >= 0) ? a[i] : Integer.MIN_VALUE;
            int aright = (i + 1 < a.length) ? a[i + 1] : Integer.MAX_VALUE;

            int bleft = (j >= 0) ? b[j] : Integer.MIN_VALUE;
            int bright = (j + 1 < b.length) ? b[j + 1] : Integer.MAX_VALUE;

            if(aleft<=bright && aright>=bleft){
                if(isEven){
                    return ((double) (Math.max(aleft,bleft)+Math.min(aright,bright))) / 2.0;
                }else{
                    return (double) Math.min(aright,bright);
                }
            }else{
                if(aleft>bright){right=i-1;}else{left=i+1;}
            }
        }

        }


    
}
