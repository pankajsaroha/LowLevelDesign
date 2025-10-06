package lld.snake.ladder;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private Dice dice;
    private int turn;

    public Game(int numOfPlayers) {
        this.players = new ArrayList<>();
        this.board = new Board();
        this.dice = new Dice();
        this.turn = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            players.add(new Player("Player-" + (i + 1)));
        }
        setup();
    }

    public void start() {
        while (true) {
            Player player = players.get(turn);
            playerTurn(player);
            if (player.isWinner()) {
                System.out.println(player.getName() + " wins the game");
                break;
            }
            nextTurn();
        }
    }

    public void setup() {
        board.addLadder(9, 27);
        board.addLadder(45, 94);
        board.addSnake(76, 21);
        board.addSnake(99, 3);
    }

    public void playerTurn(Player player) {
        System.out.println(player.getName() + "'s turn");
        int roll = dice.roll();
        System.out.println(player.getName() + " rolled a " + roll);
        player.move(roll);
        int originalPosition = board.getDestination(player.getCurrentPosition());
        player.setCurrentPosition(originalPosition);
        System.out.println(player.getName() + " moves to position " + originalPosition);
    }

    public void nextTurn() {
        turn = (turn + 1) % players.size();
    }
}
