package daily._2022_9;

import java.util.ArrayDeque;
import java.util.Deque;

public class PushDominoes {
    private static final char LEFT = 'L';
    private static final char RIGHT = 'R';
    private static final char NOT = '.';

    public String pushDominoes(String dominoes) {
        StringBuilder builder = new StringBuilder();
        Deque<Character> deque = new ArrayDeque<>();
        for (int index = 0; index < dominoes.length(); index++) {
            char current = dominoes.charAt(index);
            if (current == RIGHT) {
                if (deque.isEmpty()) deque.addLast(current);
                else {
                    build(builder, deque);
                    index--;
                }
                continue;
            }
            deque.addLast(current);
//            else builder.append(NOT);
            if (current == LEFT) build(builder, deque);
        }
        build(builder, deque);
        return builder.toString();
    }

    private void build(StringBuilder builder, Deque<Character> deque) {
        if (deque.isEmpty()) return;

        if (deque.peekFirst() == RIGHT && deque.peekLast() == LEFT) {
            int size = deque.size() / 2;
            builder.append(String.valueOf(RIGHT).repeat(Math.max(0, size)));
            if (size * 2 != deque.size()) builder.append(NOT);
            builder.append(String.valueOf(LEFT).repeat(size));
        } else if (deque.peekFirst() == RIGHT) {
            builder.append(String.valueOf(RIGHT).repeat(deque.size()));
        } else if (deque.peekLast() == LEFT) {
            builder.append(String.valueOf(LEFT).repeat(deque.size()));
        } else {
            for (Character character : deque) {
                builder.append(character);
            }
        }

        deque.clear();
    }
}
