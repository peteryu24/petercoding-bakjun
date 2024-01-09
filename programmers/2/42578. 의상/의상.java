import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> wardrobe = new HashMap<>();

        for (String[] cloth : clothes) {
            String category = cloth[1];
            wardrobe.put(category, wardrobe.getOrDefault(category, 0) + 1);
        }

        int answer = 1;

        for (int typeCount : wardrobe.values()) {
            answer *= (typeCount + 1);
        }

        return answer - 1;
    }
}
