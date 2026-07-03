class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer,Integer> indicies = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            indicies.put(numbers[i],i);
        }

        for(int i=0; i<numbers.length; i++){
            int diff = target - numbers[i];
            if(indicies.containsKey(diff) && indicies.get(diff) != i){
                return new int[]{i+1,indicies.get(diff)+1};
            } 
        }
        return new int[]{-1, -1};
    }
}