
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch == 'c') {

                if (i < input.length() - 1) {

                    if (input.charAt(i + 1) == '=') {
                        i++;
                    } else if (input.charAt(i + 1) == '-') {
                        i++;
                    }

                }

            } else if (ch == 'd') {
                if (i < input.length() - 1) {


                    if (input.charAt(i + 1) == 'z') {
                        if (i < input.length() - 2) {
                            if (input.charAt(i + 2) == '=') {
                                i+=2;
                            }
                        }

                    } else if (input.charAt(i + 1) == '-') {
                        i++;
                    }

                }

            } else if (ch == 'l') {
                if (i < input.length() - 1) {

                    if (input.charAt(i + 1) == 'j') {
                        i++;
                    }

                }
            } else if (ch == 'n') {
                if (i < input.length() - 1) {
                    if (input.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch == 's') {
                if (i < input.length() - 1) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                    }
                }

            } else if (ch == 'z') {
                if (i < input.length() - 1) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            cnt++;
        }


        System.out.println(cnt);













    }





}