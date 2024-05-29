import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        double totalSum = 0;
        double scoreSum = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {

            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            for (int j = 0; j < 10; j++) {
                if(grade.equals(gradeList[j])) {
                    totalSum += score * gradeScore[j];
                    if(j != 9) {
                        scoreSum += score;
                    }
                }

            }


        }


        double average = totalSum / scoreSum;

        System.out.printf("%.6f",average);


    }




}
