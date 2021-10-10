package jaf.kapitel5;

import java.util.ArrayList;
import java.util.Collections;

public class ex56 {
    public static void main(String[] args){

        ArrayList<String> scores = new ArrayList<String>();         //creat a new Array List with String elements
        scores.add("92");
        scores.add("120");
        scores.add("73");
        scores.add("89");
        Collections.sort(scores);
        System.out.println(scores);


        //Because the numbers are added in an array list with String elements they become strings and are not
        //sorted like numbers but instead in order of letters or in the unicode order
        //it always sorts the first digit and puts them in order
    }
}
