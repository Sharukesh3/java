class Solution {
    public int mostFrequent(int[] nums, int key) {
        for (int i=0;i<nums.length;i++)
        {
            int key = nums[i];
            for (int j=i;j<nums.length;j++)
            {
                if (nums[j]==key)
                {
                    count++;
                }
            }
        }
    }
}