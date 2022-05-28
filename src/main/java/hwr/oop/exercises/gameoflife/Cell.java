package hwr.oop.exercises.gameoflife;


public class Cell {
    private Position position;
    private boolean alive;
    private Cell[] neighbours;
    public Cell(Position position) {
        this.position = position;
    }

    public void setNeighbours(Cell[] neighbours) {
        this.neighbours = neighbours;
    }

    public Cell[] getNeighbours() {
        return neighbours;
    }

    public void markAlive() {
        alive = true;
    }

    public boolean isAliveNextGeneration() {
        return false;
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean isDead() {
        return !alive;
    }

    public Position getPosition() {
        return position;
    }
}
