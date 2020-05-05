package Easy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Pangram to tekst zawierający wszystkie litery wybranego alfabetu. Pangramem perfekcyjnym nazwiemy pangram, w którym każda litera występuje taką samą liczbę razy.
Dany jest wyraz złożony z małych liter alfabetu angielskiego. Odpowiedz na pytanie, czy jest on pangramem lub pangramem perfekcyjnym alfabetu angielskiego?
Wejście
W pierwszej i jedynej linii wejścia znajduje się wyraz o długości n ∈ [1, 2600000] złożony z małych liter alfabetu angielskiego.
Wyjście
Jeżeli dany wyraz jest pangramem perfekcyjnym na wyjściu należy wypisać PANGRAM PERFEKCYJNY.
Jeżeli dany wyraz jest pangramem, ale nie perfekcyjnym, na wyjściu należy wypisać PANGRAM.
W pozostałych przypadkach należy wypisać NIE.

 */

public class Pangram {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\ciech\\IdeaProjects\\pl.ciechmar\\src\\main\\java\\Easy\\in.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine().trim().toUpperCase();
        czyPangram(line);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String s = bufferedReader.readLine().trim().toUpperCase();
//        czyPangram(s);
    }

    private static void czyPangram(String line) {
        Map<Character, Integer> alphabetList = new HashMap<>();

        for (int i = 0; i <= 25; i++) {
            alphabetList.put((char) (i + 65), 0);
        }
        for (int i = 0; i < line.length(); i++) {
            for (Character element : alphabetList.keySet()) {
                if (element.equals(line.charAt(i))) {
                    alphabetList.put((line.charAt(i)), alphabetList.get(line.charAt(i)) + 1);
                }
            }
        }
        long czyPerfekcyjny = 0;
        int czyPangram = 0;
        for (Integer element : alphabetList.values()) {
            if (element == 0) {
                czyPangram = -1;
                break;
            }
        }

        if (czyPangram != -1) {
            Integer firstValue = alphabetList.get('A');
            for (Integer element : alphabetList.values()) {
                if (element == firstValue) {
                    czyPerfekcyjny++;
                }
            }
            System.out.println("Perfekcyjny to: " + czyPerfekcyjny);
        }

        if (czyPerfekcyjny == 26) {
            System.out.println("PANGRAM PERFEKCYJNY");
        } else if (czyPangram == -1) {
            System.out.println("NIE");
        } else {
            System.out.println("PANGRAM");
        }
    }

}
