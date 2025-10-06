package lld.snake.ladder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;

    public Board() {
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
    }

    public void addSnake(int start, int end) {
        snakes.put(start, end);
    }

    public void addLadder(int start, int end) {
        ladders.put(start, end);
    }

    public int getDestination(int position) {
        if (snakes.containsKey(position)) {
            return snakes.get(position);
        } else if (ladders.containsKey(position)) {
            return ladders.get(position);
        }
        return position;
    }
}
