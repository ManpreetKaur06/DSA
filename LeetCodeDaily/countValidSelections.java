class CountValidSelections {
     public int countValidSelections(int[] nums) {
         int n = nums.length;
        int result = 0;
        int currSum = 0;
        int S = 0;

        for (int num : nums) {
            S += num;
        }

        for (int i = 0; i < n; i++) {
            currSum += nums[i];

            int left  = currSum;
            int right = S - left;

            if (nums[i] != 0) 
                continue;

            if (left == right)
                result += 2;
            else if (Math.abs(left - right) == 1)
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        CountValidSelections obj = new CountValidSelections(); // create object
        int[] nums = {1,0,2,0,3};
        int ans = obj.countValidSelections(nums); // call non-static method using object
        System.out.println("Answer is: " + ans);
    }
}
