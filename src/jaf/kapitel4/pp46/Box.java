package jaf.kapitel4.pp46;

public class Box {
    private int height;
    private int width;
    private int depth;
    private boolean full;

    public Box(){
        this.height = 0;
        this.width = 0;
        this.depth = 0;
        this.full = false;
    }

    public void setHeight(int height) {
        this.height = height;
    }

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
    }

    public boolean isFull() {
        return full;
    }

    public String toString() {
        return "height : " + getHeight() + " m" + "\t" + " depth : " + getDepth() + " m " + "\t" + " width : " + getWidth() + " m " + "\t" + " The box is full?  " + isFull();
    }
}