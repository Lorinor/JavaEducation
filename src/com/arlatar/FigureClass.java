package com.arlatar;

public abstract class FigureClass {
    private final String color;
    private char coordX;
    private int coordY;

    public FigureClass(String color, char coordX,int coordY){
        this.color = color;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void moveTo(char X, int Y ){
        if (checkMoving(X, Y)){

        }
    }

    protected abstract boolean checkMoving(char x, int y);

    public String getColor(){
        return color;
    }
    public char getX (){
        return coordX;
    }
    public int getY (){
        return coordY;
    }
}
