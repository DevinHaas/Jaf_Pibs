package jaf.kapitel4.pp46;

public class BoxTest {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box();

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
