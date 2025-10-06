package lld.snake.ladder;

public class Player {
    private String name;
    private int currentPosition;

    public Player (String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public void move(int step) {
        currentPosition = (currentPosition + step) > 100 ? currentPosition : currentPosition + step;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public boolean isWinner () {
        return currentPosition == 100;
    }
}
