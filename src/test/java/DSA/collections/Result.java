package DSA.collections;

import java.util.*;

public class Result {

    public static List<String> processLogs(List<String> logs, int threshold) {
        Map<String, Integer> countMap = new HashMap<>();

        // Count transactions
        for (String log : logs) {
            String[] parts = log.split(" ");
            String sender = parts[0];
            String receiver = parts[1];

            if (sender.equals(receiver)) {
                countMap.put(sender, countMap.getOrDefault(sender, 0) + 1);
            } else {
                countMap.put(sender, countMap.getOrDefault(sender, 0) + 1);
                countMap.put(receiver, countMap.getOrDefault(receiver, 0) + 1);
            }
        }

        // Filter users who meet threshold
        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= threshold) {
                output.add(entry.getKey());
            }
        }

        // Sort numerically (since IDs are numeric strings)
        Collections.sort(output, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));

        return output;
    }

    public static void main(String[] args) {
        String[] logs = {"88 99 200", "88 99 300", "99 32 100", "12 12 15"};
        int threshold = 2;

        System.out.println(processLogs(Arrays.asList(logs), threshold));
    }
}
