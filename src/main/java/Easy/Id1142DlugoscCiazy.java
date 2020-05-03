package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Id1142DlugoscCiazy {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int testNumber = Integer.parseInt(s);
        for (int i = 0; i < testNumber; i++) {
            s = bufferedReader.readLine().trim();
            System.out.println(dlugoscCiazy(s));
        }
        bufferedReader.close();
    }

    private static int dlugoscCiazy(String line) {
        int endOfFirstNumber = line.indexOf(" ");
        int x = Integer.parseInt(line.substring(0, endOfFirstNumber).trim());
        int endOfSecondNumber = line.indexOf(" ", endOfFirstNumber);
        int y = Integer.parseInt(line.substring(endOfFirstNumber + 1, (endOfSecondNumber + endOfFirstNumber)).trim());
        int endOfThirdNumber = line.indexOf(" ", endOfSecondNumber);
        int z = Integer.parseInt(line.substring(endOfSecondNumber + endOfFirstNumber).trim());
        int dlugoscCiazy = ((-12 * (x + y - z * y) / (z - 1)));
        return dlugoscCiazy;
    }

}
