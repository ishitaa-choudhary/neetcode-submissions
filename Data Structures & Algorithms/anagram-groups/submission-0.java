class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s: strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String st=new String(c);
            map.putIfAbsent(st,new ArrayList<>());
            map.get(st).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
