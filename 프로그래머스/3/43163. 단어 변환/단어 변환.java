import java.util.LinkedList;
import java.util.Queue;

class Solution {

    boolean[] visited;

    class Word {

        String word;

        int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

    public int solution(String begin, String target, String[] words) {

        Queue<Word> queue = new LinkedList<>();

        visited = new boolean[words.length];

        queue.offer(new Word(begin, 0));

        while (!queue.isEmpty()) {

            Word cur = queue.poll();


            if (cur.word.equals(target)) {
                return cur.count;
            }

            for (int i = 0; i < words.length; i++) {

                if (visited[i]) {
                    continue;
                }


                if (isCanChanged(cur.word, words[i])) {

                    visited[i] = true;
                    queue.offer(new Word(words[i], cur.count + 1));
                }

            }


        }


        return 0;
    }

    private boolean isCanChanged(String word, String target) {

        int diff = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) != target.charAt(i)) {
                diff++;
            }

            if (diff > 1) {
                return false;
            }

        }

        return diff == 1;
    }
}