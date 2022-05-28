package hwr.oop.exercises.tictactoe;

class TicTacToe {
    int[] squares = new int[9];
    int currentTurn = 0;

    TicTacToe() {
        // TODO implement!
    }

    int getValueAt(int x, int y) {
        return squares[y * 3 + x];
    }

    void setCross(int x, int y) {
        if (squares[y * 3 + x] == 0 && currentTurn % 2 == 0 && !isGameOver()) {
            squares[y * 3 + x] = 1;
            currentTurn++;
        } else {
            throw new RuntimeException();
        }
    }

    void setCircle(int x, int y) {
        if (squares[y * 3 + x] == 0 && currentTurn % 2 == 1 && !isGameOver()) {
            squares[y * 3 + x] = 2;
            currentTurn++;
        } else {
            throw new RuntimeException();
        }
    }

    boolean isGameOver() {
        boolean over = true;
        for (int field : squares) {
            if (field == 0) {
                over = false;
            }
        }
        if (squares[0] == squares[1] && squares[2] == squares[1] && squares[0] != 0 ||
                squares[3] == squares[4] && squares[4] == squares[5] && squares[3] != 0 ||
                squares[6] == squares[7] && squares[7] == squares[8] && squares[6] != 0 ||
                squares[3] == squares[0] && squares[3] == squares[6] && squares[3] != 0 ||
                squares[1] == squares[4] && squares[4] == squares[7] && squares[1] != 0 ||
                squares[2] == squares[5] && squares[5] == squares[8] && squares[2] != 0 ||
                squares[0] == squares[4] && squares[4] == squares[8] && squares[0] != 0 ||
                squares[2] == squares[4] && squares[4] == squares[6] && squares[2] != 0
        ) {
            over = true;
        }
        return over;
    }

}
