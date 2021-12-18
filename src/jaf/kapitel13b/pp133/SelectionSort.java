package jaf.kapitel13b.pp133;

public class SelectionSort {

    private SortNode list;


    public SelectionSort(){
        list = null;
    }

    public void add(int value){
        SortNode node = new SortNode(value);
        SortNode current = null;

        if (list == null){
            list = node;
        } else {
            current = list;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }

    }

    public void sort(){

        SortNode current = list;
        SortNode min = list;
        SortNode swapBox = list;

        if (list == null)
            return;

        while (swapBox.next != null){
            while (current.next != null){ //find min values
                current = current.next;
                if (current.value <  min.value){
                    min = current;
                }
            }

            //swap the values
            if (min != swapBox){ // a swap was found

                int temp = min.value;
                min.value = swapBox.value;
                swapBox.value = temp;
            }
            swapBox = swapBox.next;
            current = swapBox;
            min = current;
        }

    }

    @Override
    public String toString() {
        String report = "";
        SortNode current = list;

        if (current!= null){

            report = current.value + " ";
            while (current.next != null){
                current = current.next;
                report += current.value + " ";


            }
        }
        return report;
    }

    private static class SortNode{
        public int value;
        public SortNode next;


        public SortNode (int current){

            value = current;
            next = null;
        }
    }
}
