package hwr.oop.exercises.gameoflife;

import java.util.List;

public class Field {
    private Position[] positions;
    private Cell[] cells;
    public Field(int FIELD_SIZE) {
        positions = new Position[FIELD_SIZE * FIELD_SIZE];
        cells = new Cell[FIELD_SIZE * FIELD_SIZE];
        int index = 0;
        for (int x = 0; x < FIELD_SIZE; x++) {
            for (int y = 0; y < FIELD_SIZE; y++) {
                Position p = new Position(x, y);
                Cell c = new Cell(positions[index]);
                cells[index] = c;
                positions[index] = p;
                index++;
            }
        }
        for (int i = 0; i < cells.length; i++) {
            if (i == 0 || i == FIELD_SIZE-1 || i == FIELD_SIZE*FIELD_SIZE-FIELD_SIZE || i == FIELD_SIZE*FIELD_SIZE-1){
            } else if (i <= FIELD_SIZE-1 ||
                    i >= FIELD_SIZE && i <= FIELD_SIZE *(FIELD_SIZE-2) ||
                    i >= 2*FIELD_SIZE-1 && i <= FIELD_SIZE*FIELD_SIZE-FIELD_SIZE-1 ||
                    i >= FIELD_SIZE*FIELD_SIZE-FIELD_SIZE+1 && i <= FIELD_SIZE*FIELD_SIZE-2) {

            } else {

            }
        }
    }

    public Cell getCellAt(Position centerPosition) {
        return cells[centerPosition.column * 2 + centerPosition.row];
    }

}
