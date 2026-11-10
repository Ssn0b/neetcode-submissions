class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length; i++){
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String newSortedString = new String(sorted);
            if(map.containsKey(newSortedString)){
                List<String> elements = map.get(newSortedString);
                elements.add(strs[i]);
            }else {
                List<String> elements = new ArrayList<>();
                elements.add(strs[i]);
                map.put(newSortedString, elements);
            }
        }

        return new ArrayList<>(map.values());
    }
}
