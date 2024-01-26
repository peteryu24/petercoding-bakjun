import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    HashMap<String, Integer> genrePlayCount = new HashMap<>();
    HashMap<String, List<int[]>> songsInGenre = new HashMap<>();

    public int[] solution(String[] genres, int[] plays) {
        initializeMaps(genres, plays);
        String[] sortedGenres = sortGenresByPlayCount(); 
        return buildAnswerArray(sortedGenres);
    }

    void initializeMaps(String[] genres, int[] plays) {
        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
            if (!songsInGenre.containsKey(genres[i])) {
                songsInGenre.put(genres[i], new ArrayList<>());
            }
            songsInGenre.get(genres[i]).add(new int[] { i, plays[i] });
        }
    }

    String[] sortGenresByPlayCount() {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(genrePlayCount.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        String[] sortedGenres = new String[entries.size()];
        for (int i = 0; i < entries.size(); i++) {
            sortedGenres[i] = entries.get(i).getKey();
        }
        return sortedGenres;
    }

    int[] buildAnswerArray(String[] sortedGenres) {
        List<Integer> answerList = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = songsInGenre.get(genre);
            songs.sort((a, b) -> b[1] == a[1] ? a[0] - b[0] : b[1] - a[1]);

            answerList.add(songs.get(0)[0]);
            if (songs.size() > 1) {
                answerList.add(songs.get(1)[0]);
            }
        }
        int[] result = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            result[i] = answerList.get(i);
        }
        return result;
    }
}
