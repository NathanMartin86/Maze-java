package com.theironyard;

/**
 * Created by macbookair on 12/1/15.
 */
public class Room {
    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean isStart = false;
    boolean isFinish = false;

    public Room(int row, int column) {
        this.row = row;
        this.col = column;
    }
}
