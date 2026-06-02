import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public static ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {

        // 1~n번으로 분류되는 개인정보 n개 -> 약관종류는 여러개, 유효기간이 정해져있다.
        // 수집된 개인정보는 유효기간 전까지만 보관 가능 -> 지나면 반드시 파기해야함


        ArrayList<Integer> list = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate day = LocalDate.parse(today, formatter);

        for (int i = 0; i < terms.length; i++) {

            String[] term = terms[i].split(" ");

            String keyword = term[0];
            String plusMonth = term[1];

            for (int j = 0; j < privacies.length; j++) {


                if (privacies[j].contains(keyword)) {
                    String[] termDate = privacies[j].split(" ");

                    LocalDate date = LocalDate.parse(termDate[0], formatter).plusMonths(Long.parseLong(plusMonth));

                    if (day.isAfter(date) || day.isEqual(date)) {
                        list.add(j+1);
                    }

                }


            }

        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public static void main(String[] args) {


        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(solution(today, terms, privacies));
    }
}