class GetSneakyNumbers {
    
    public int[] getSneakyNumbers(int[] nums) {

        // Using constant space
        int n = nums.length;
        int idx=0;
        int[] freq = new int[n];
        int[] res = new int[2];

        for(int num : nums){
            freq[num]++;
            if(freq[num]==2){
                res[idx++] = num;
            }
        }
        return res;


        // Using HashSet
        // Set<Integer> set1 = new HashSet<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int num : nums){
        //     if(set1.contains(num)){
        //         list.add(num);
        //     }else{
        //         set1.add(num);
        //     }
        // }
        // return new int[]{list.get(0),list.get(1)};
}
    public static void main(String[] args) {
        GetSneakyNumbers outer = new GetSneakyNumbers();
       
        int[] nums = {0,1,1,0};
        int[] ans = outer.getSneakyNumbers(nums);
        System.out.println("Answer is: [" + ans[0] + ", " + ans[1] + "]");
    }
}
