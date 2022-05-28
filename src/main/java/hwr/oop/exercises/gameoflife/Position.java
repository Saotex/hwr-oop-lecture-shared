package hwr.oop.exercises.gameoflife;

public class Position {
    int column;
    int row;
    public Position(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public boolean isNextTo(Position neighbour) {
        boolean isNext = false;
        for (int x = -1; x < 2; x++) {
            for (int y = -1; y < 2; y++) {
                if (neighbour.column == this.column -x && neighbour.row == this.row -y){
                    isNext = true;
                }
            }
        }
        return isNext;
    }

    public boolean equals(Object obj){

        return false;
    }

}
