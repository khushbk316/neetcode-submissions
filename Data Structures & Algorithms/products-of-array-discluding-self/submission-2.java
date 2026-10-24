class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        // for(int i = 0;i<length;i++)
        // {
        //     int product = 1;
        //     for(int j =0;j<length;j++)
        //     {
        //         if(i!=j)
        //         {
        //             product = product*nums[j];
        //         }
        //     }
        //     result[i] = product;
        // }
        // return result;

        int[] left = new int[length];
        int[] right = new int[length];
        left[0]=1;
        for(int i = 1;i<length;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(int i=length-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i = 0;i<length; i++)
        {
            result[i] = left[i]*right[i];
        }
        return result;
    }
}  
