package com.dobrosav.chess2.game;

import javafx.scene.layout.StackPane;

public class Square extends StackPane {

    private int x,y;
    private boolean occupied;
    private  String name;

    public Square(int x, int y){
        this.x = x;
        this.y = y;
        this.occupied = false;
    }

    @Override
    public String toString() {
        return "Square";
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setName(String name){
        this.name = name;
    }


}
