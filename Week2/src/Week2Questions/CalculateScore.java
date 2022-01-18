package Week2Questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateScore {
    private static final int CORRECTSCORE = 4;
    private static final int INCORRECTSCORE = -1;
    private static final int UNATTEMPTEDSCORE = 0;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/kunalgupta/Desktop/DSA/src/score.txt");
        Scanner scanner = new Scanner(file);

        String response = "";
        while (scanner.hasNext()) {
            response = scanner.nextLine();
            showScore(response);
        }
    }

    private static void showScore(String response) {

        String[] answers = response.split("");

        Map<String, Integer> map = new HashMap<>();

        for (String element : answers) {
            if (map.containsKey(element)) {
                int previousValue = map.get(element);
                map.put(element, previousValue + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " came " + entry.getValue() + " times");
        }

        int correct = map.get("c");
        int incorrect = map.get("i");
        int unattempted = map.get("u");
        int totalScore = (correct * CORRECTSCORE) + (incorrect * INCORRECTSCORE) + (unattempted * UNATTEMPTEDSCORE);

        System.out.println("your score is = " + totalScore);
    }
}
