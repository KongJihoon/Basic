import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String binary = br.readLine();

        BigInteger N = new BigInteger(binary,2);

        String result = N.toString(8);

        System.out.println(result);
    }


}
