import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        // 속한 노래가 많이 재생된 장르를 먼저 수록
        // 장르 내에서 많이 재생된 노래를 먼저 수록
        // 장르 내에서 노래 재생 횟수가 같다면 고유번호(index)가 낮은 노래를 먼저 수록

        Map<String, Integer> totalPlay = new HashMap<>();
        Map<String, List<Music>> genreByMusic = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            String genre = genres[i];
            int play = plays[i];

            totalPlay.put(genre, totalPlay.getOrDefault(genre, 0) + play);

            if (!genreByMusic.containsKey(genre)) {
                genreByMusic.put(genre, new ArrayList<>());
            }

            genreByMusic.get(genre).add(new Music(i, play));

        }

        List<String> sortByGenre = new ArrayList<>(totalPlay.keySet());

        sortByGenre.sort(
                (g1, g2) -> totalPlay.get(g2) - totalPlay.get(g1)
        );

        List<Integer> answer = new ArrayList<>();

        for (String genre : sortByGenre) {

            List<Music> music = genreByMusic.get(genre);

            music.sort(
                    (s1, s2) -> {
                        if (s1.play == s2.play) {
                            return s1.index - s2.index;
                        }

                        return s2.play - s1.play;
                    }
            );

            answer.add(music.get(0).index);

            if (music.size() > 1) {
                answer.add(music.get(1).index);
            }

        }


        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    class Music {
        int index;
        int play;

        public Music(int index, int play) {
            this.index = index;
            this.play = play;
        }
    }
}