public class GroupNoAdj {
    public static void main(String[] args) {
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        
        return groupNoAdj(start + 1, nums, target);
    }
}

