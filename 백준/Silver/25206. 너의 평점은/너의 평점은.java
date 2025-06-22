
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 20;

        double sumScore = 0.0;

        double sumCredit = 0.0;

        while (n-- > 0) {

            String[] parts = br.readLine().split(" ");

            double credit = Double.parseDouble(parts[1]);
            String grade = parts[2];

            if (grade.equals("P")) continue;

            double gp = 0.0;

            switch (grade) {

                case "A+" :
                    gp = 4.5;
                    break;
                case "A0" :
                    gp = 4.0;
                    break;
                case "B+" :
                    gp = 3.5;
                    break;
                case "B0" :
                    gp = 3.0;
                    break;
                case "C+" :
                    gp = 2.5;
                    break;
                case "C0" :
                    gp = 2.0;
                    break;
                case "D+" :
                    gp = 1.5;
                    break;
                case "D0" :
                    gp = 1.0;
                    break;
                case "F" :
                    gp = 0.0;
                    break;
                default: gp = 0.0;
            }

            sumScore += credit * gp;
            sumCredit += credit;


        }

        System.out.printf("%.6f", sumScore / sumCredit);


    }



}