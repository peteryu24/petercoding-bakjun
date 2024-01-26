package bakjun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    final int SONG_INDEX = 0;
    final int PLAY_COUNT = 1;
    final int TOP_SONGS_LIMIT = 2;

    HashMap<String, Integer> totalPlayCntByGenre = new HashMap<>();
    HashMap<String, List<int[]>> songIndexAndPlayCntByGenre = new HashMap<>();

    public int[] solution(String[] genres, int[] playCnt) {
        initializeMaps(genres, playCnt);
        String[] sortedGenres = sortGenresByPlayCntDesc();
        return topSongsForGenre(sortedGenres);
    }

    void initializeMaps(String[] genres, int[] plays) {
        for (int i = 0; i < genres.length; i++) {
            totalPlayCntByGenre.put(genres[i], totalPlayCntByGenre.getOrDefault(genres[i], 0) + plays[i]);
            songIndexAndPlayCntByGenre.computeIfAbsent(genres[i], k -> new ArrayList<>())
                                 .add(new int[] { i, plays[i] });
        }
    }

    String[] sortGenresByPlayCntDesc() {
        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(totalPlayCntByGenre.entrySet());
        genreList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        String[] sortedGenres = new String[genreList.size()];
        for (int i = 0; i < genreList.size(); i++) {
            sortedGenres[i] = genreList.get(i).getKey();
        }
        return sortedGenres;
    }

    int[] topSongsForGenre(String[] sortedGenres) {
        List<Integer> topSongs = new ArrayList<>();
        for (String genre : sortedGenres) {
            PriorityQueue<int[]> queue = createPriorityQueueForSong(songIndexAndPlayCntByGenre.get(genre));
            for (int i = 0; i < TOP_SONGS_LIMIT && !queue.isEmpty(); i++) {
                topSongs.add(queue.poll()[SONG_INDEX]);
            }
        }

        int[] result = new int[topSongs.size()];
        for (int i = 0; i < topSongs.size(); i++) {
            result[i] = topSongs.get(i);
        }
        return result;
    }

    PriorityQueue<int[]> createPriorityQueueForSong(List<int[]> songs) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a, b) -> a[PLAY_COUNT] == b[PLAY_COUNT] ? a[SONG_INDEX] - b[SONG_INDEX] : b[PLAY_COUNT] - a[PLAY_COUNT]
        );
        queue.addAll(songs);
        return queue;
    }
}
