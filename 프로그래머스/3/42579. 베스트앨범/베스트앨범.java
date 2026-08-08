import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    class Song {

        int index;

        int play;

        public Song(int index, int play) {
            this.index = index;
            this.play = play;
        }

    }

    public int[] solution(String[] genres, int[] plays) {

        Map<String, Integer> totalPlay = new HashMap<>();

        Map<String, List<Song>> songsByGenre = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            String genre = genres[i];
            int play = plays[i];

            totalPlay.put(genre, totalPlay.getOrDefault(genre, 0) + play);

            if (!songsByGenre.containsKey(genre)) {
                songsByGenre.put(genre, new ArrayList<>());
            }

            songsByGenre.get(genre).add(new Song(i, play));


        }

        List<String> genreList = new ArrayList<>(totalPlay.keySet());

        genreList.sort(
                (g1, g2) -> totalPlay.get(g2) - totalPlay.get(g1)
        );
        
        List<Integer> answer = new ArrayList<>();
        
        for (String genre : genreList) {
            
            List<Song> songs = songsByGenre.get(genre);
            
            songs.sort(
                    (s1, s2) -> {
                        if (s1.play == s2.play) {
                            return s1.index - s2.index;
                        }
                        
                        return s2.play - s1.play;
                    }
            );
        
            answer.add(songs.get(0).index);
            
            if (songs.size() >= 2) {
                answer.add(songs.get(1).index);
            }
        
        }
        
        
        


        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}