class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (!ban.contains(w) && w.length() > 0)
                map.put(w, map.getOrDefault(w, 0) + 1);
        }
        String res = "";
        int max = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                res = key;
            }
        }
        return res;
    }
}
