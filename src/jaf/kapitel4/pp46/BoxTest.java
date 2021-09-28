package jaf.kapitel4.pp46;

// *******************************************************************************************************
//  kapitel4.PP46.java           Author:Devin/Hasler
//  Creat the class BoxTest to make it possible to creat boxes including height, width, depth and fullness
// ********************************************************************************************************


public class BoxTest {
    public static void main(String[] args){
        Box box1 = new Box(5,5,5);          //set height, depth and width
        Box box2 = new Box(4,3,6);

        box1.setHeight(5);
        box1.setDepth(5);
        box1.setWidth(5);

        System.out.println(box1.getDepth());
        System.out.println(box1.getWidth());
        System.out.println(box2.isFull());

        System.out.println(box1.toString());

        box2.setFull(true);
        System.out.println(box2.isFull());


    }
}
