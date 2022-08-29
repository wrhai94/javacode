package others;

public class BitFindOnce {
    public static void main(String[] args) {
        int[] nums = {0,1,33,33,0,63,1};
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }

        System.out.println(num);
    }
}
