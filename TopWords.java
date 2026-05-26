import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "aboba.txt";

        File file = new File(filePath);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // HashMap to store words and their occurrence frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        if (scanner != null) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();

                // Increment word count if it exists, otherwise add it with count 1
                if (wordCount.containsKey(word)) {
                    int count = wordCount.get(word);
                    wordCount.put(word, count + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }

        if (scanner != null) {
            scanner.close();
        }

        // Convert Map entries to a List so it can be sorted
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        // Sort the list descending based on values using an anonymous Comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Топ-10 самых частых слов в файле:");

        // Print the top 10 most frequent words
        for (int i = 0; i < 10; i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " — " + entry.getValue() + " раз(а)");
        }
    }
}
