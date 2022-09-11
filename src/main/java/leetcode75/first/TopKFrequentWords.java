package leetcode75.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String word : words) {
            cnt.compute(word, (key, val) -> val == null ? 1 : ++val);
        }

        PriorityQueue<String> queue = new PriorityQueue<>((w1, w2) -> cnt.get(w1).equals(cnt.get(w2)) ? w2.compareTo(w1) : cnt.get(w1) - cnt.get(w2));
        for (String word : cnt.keySet()) {
            queue.offer(word);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) result.add(queue.poll());
        Collections.reverse(result);
        return result;
    }
}
