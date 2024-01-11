import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
	HashMap<String, Integer> genrePlayCount = new HashMap<>();
	HashMap<String, List<int[]>> songsInGenre = new HashMap<>();

	public int[] solution(String[] genres, int[] plays) {
		initializeMaps(genres, plays);
		List<String> sortedGenres = sortGenresByPlayCount();
		return buildAnswerArray(sortedGenres);
	}

	void initializeMaps(String[] genres, int[] plays) {
		for (int i = 0; i < genres.length; i++) {
			genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
			songsInGenre.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[] { i, plays[i] });
		}
	}

	List<String> sortGenresByPlayCount() {
		return genrePlayCount.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	int[] buildAnswerArray(List<String> sortedGenres) {
		List<Integer> answerList = new ArrayList<>();
		for (String genre : sortedGenres) {
			List<int[]> songs = songsInGenre.get(genre);
			songs.sort((a, b) -> b[1] == a[1] ? a[0] - b[0] : b[1] - a[1]);

			answerList.add(songs.get(0)[0]);
			if (songs.size() > 1) {
				answerList.add(songs.get(1)[0]);
			}
		}
		return answerList.stream().mapToInt(i -> i).toArray();
	}
}
