class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[right] + numbers[left] == target){
                return new int[]{left+1,right+1};
            }else if(numbers[right] + numbers[left] < target){
                left++;
            }else if(numbers[right] + numbers[left] > target){
                right--;
            }
        }
                return new int[]{left+1,right+1};
    }
}
