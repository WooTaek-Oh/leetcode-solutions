class Solution {
    public int[] twoSum(int[] nums, int target) { 
        //nums = [2,7,11,15], target = 9
        int answer[] = new int[2];
        HashMap<Integer, Integer>TS = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            TS.put(i, nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((TS.get(i) + TS.get(j)) == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}