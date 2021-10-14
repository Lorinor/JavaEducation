package com.arlatar;

public class King extends FigureClass{
    private int weight = 8;

    public King(String color, char coordX, int coordY) {
        super(color, coordX, coordY);
    }

    @Override
    public boolean checkMoving(char x, int y) {
        return false;
    }
}
