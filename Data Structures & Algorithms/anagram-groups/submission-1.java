// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> result = new ArrayList<>();
//         boolean[] visited = new boolean[strs.length];

//         for (int i = 0; i < strs.length; i++) {
//             if (visited[i]) {
//                 continue;
//             }

//             ArrayList<String> list = new ArrayList<>();
//             list.add(strs[i]);
//             visited[i] = true;

//             for (int j = i + 1; j < strs.length; j++) {
//                 if (!visited[j] && isAnagram(strs[i], strs[j])) {
//                     list.add(strs[j]);
//                     visited[j] = true;
//                 }
//             }

//             result.add(list);
//         }

//         return result;
//     }

//     public boolean isAnagram(String str1, String str2) {
//         HashMap<Character, Integer> hm1 = new HashMap<>();
//         HashMap<Character, Integer> hm2 = new HashMap<>();

//         for (int i = 0; i < str1.length(); i++) {
//             hm1.put(
//                 str1.charAt(i),
//                 hm1.getOrDefault(str1.charAt(i), 0) + 1
//             );
//         }

//         for (int i = 0; i < str2.length(); i++) {
//             hm2.put(
//                 str2.charAt(i),
//                 hm2.getOrDefault(str2.charAt(i), 0) + 1
//             );
//         }

//         return hm1.equals(hm2);
//     }
// }


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}