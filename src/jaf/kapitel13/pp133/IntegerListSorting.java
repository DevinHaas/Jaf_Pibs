package jaf.kapitel13.pp133;

public class IntegerListSorting {

  public static void main(String[] args) {
    SelectionSort2 sorter = new SelectionSort2();
    ListGenerator list1 = new ListGenerator();
    ListGenerator list2 = new ListGenerator();

    System.out.println("List before sorting " + list1.getList());
    sorter.sorting(list1.getList());
    System.out.println("List after sorting" + list1.getList() + "\n");

    System.out.println("List before sorting " + list2.getList());
    sorter.sorting(list2.getList());
    System.out.println("List after sorting" + list2.getList() + "\n");
  }
}
