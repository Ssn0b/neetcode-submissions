class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                Integer element = map.get(nums[i]);
                element++;
                map.put(nums[i], element);
            }else{
                map.put(nums[i], 1);
            }
        }
        int[] result = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    
        return result;
    }
}
