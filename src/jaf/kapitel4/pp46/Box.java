package jaf.kapitel4.pp46;

// ***************************************************************************************************
//  kapitel4.PP46.java           Author:Devin/Hasler
//  Creat the class Box to make it possible to creat boxes including height, width, depth and fullness
// ****************************************************************************************************

public class Box {
    private int height;
    private int width;
    private int depth;
    private boolean full;

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }

    public void setHeight(int height) {
        this.height = height;
    }       //set getter and setter methods

    public int getHeight() {
        return height;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setFull(boolean full) {
        this.full = full;
    }           //set a method for making the box full

    public boolean isFull() {
        return full;
    }

    public String toString() {
        return "height : " + getHeight() + " m" + "\t" + " depth : " + getDepth() + " m " + "\t" + " width : " + getWidth() + " m " + "\t" + " The box is full?  " + isFull();
    }
}
