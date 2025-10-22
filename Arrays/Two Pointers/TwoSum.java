import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumBruteForce(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int []{i,j};
                }
            }
        } 
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int []twoSumUsingMap(int nums[], int target){
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int i =0 ; i<n ; i++){
            int difference = target - nums[i];
            if(mp.containsKey(difference)){
                return new int[]{mp.get(difference),i};
            }
            mp.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    
    }
    public static void main(String[] args) {
        int arr[]={2,7,1,11};
        int target=9;

        int result[]=twoSumBruteForce(arr, target);
        System.out.println("indices are : "+ result[0] + " and "+ result[1]);

        int resultMap[]=twoSumUsingMap(arr, target);
        System.out.println("indices are : "+ resultMap[0] + " and "+ resultMap[1]);
    }
}
