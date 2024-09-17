class Soluti {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            System.out.println(nums[j]);

        }
        return j;
    }
    public static void main(String arg[]){
        int nums[] = {1,1,2};
        removeDuplicates(nums);
    }
}