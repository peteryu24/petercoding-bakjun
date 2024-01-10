import java.util.HashMap;

class Solution {
	public int solution(String[][] clothes) {

		HashMap<String, Integer> clothesCntByCategory = new HashMap<>(); // 옷들을 담을 옷장

		for (String[] getCategory : clothes) {
			String category = getCategory[1]; // clothes[i][1]에 접근하여 카테고리 추춣 
			clothesCntByCategory.put(category, clothesCntByCategory.getOrDefault(category, 0) + 1); // 신규 or 기존 카테고리에 의상 추가
		}

		int answer = 1; // 곱셈을 위해 1로 초기화

		for (int clothesCnt : clothesCntByCategory.values()) {
			answer *= (clothesCnt + 1); // 카테고리 별 의상 갯수 + 1(아무것도 안 입는 경우의 수)
		}

		return answer - 1; // 하나도 안 입는 경우의 수 배제
	}
}
