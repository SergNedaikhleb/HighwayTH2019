package homework_SeaBattle;

import java.util.List;
import java.util.Random;

class ComputerRandomStrategy extends Strategy {

    ComputerRandomStrategy(Board board) {
        super(board);
    }

    String getNextMove() {
        List<String> possibleMoves = board.getShotableCells();
        Random randomGenerator = new Random();
        String move = possibleMoves.get(randomGenerator.nextInt(possibleMoves.size()));

        System.out.println("Computer moves: " + move);
        return move;
    }}
