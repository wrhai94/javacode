package others;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] nums2 = sortedSquares(nums);
        System.out.println(nums2);

    }

    public static int[] sortedSquares(int[] nums) {
        if(nums.length == 0) {
            return nums;
        }
        int l = 0;
        int r = nums.length - 1;
        int[] nums2 = new int[nums.length];

        int i = 1;
        int len = nums.length;
        {
            int l_num = nums[l] * nums[l];
            int r_num = nums[r] * nums[r];

            if (l_num > r_num){
                nums2[nums.length - i] = l_num;
                l++;
            } else {
                nums2[nums.length - i] = r_num;
                r--;
            }
            i++;
        } while (i <= len);

        return nums2;
    }
}
