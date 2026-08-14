import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        Map<String, Integer> genrePlays = new HashMap<>();

        Map<String, List<Music>> genreByMusic = new HashMap<>();


        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genrePlays.put(genre, genrePlays.getOrDefault(genre, 0) + play);

            if (!genreByMusic.containsKey(genre)) {
                genreByMusic.put(genre, new ArrayList<>());
            }

            genreByMusic.get(genre).add(new Music(i, play));

        }

        List<String> sortByGenre = new ArrayList<>(genrePlays.keySet());

        sortByGenre.sort(
                (g1, g2) -> genrePlays.get(g2) - genrePlays.get(g1)
        );

        List<Integer> answer = new ArrayList<>();


        for (String genre : sortByGenre) {

            List<Music> musics = genreByMusic.get(genre);

            musics.sort(
                    (m1, m2) -> {
                        if (m1.play == m2.play) {
                            return m1.index - m2.index;
                        }

                        return m2.play - m1.play;
                    }
            );

            answer.add(musics.get(0).index);

            if (musics.size() > 1) {
                answer.add(musics.get(1).index);
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