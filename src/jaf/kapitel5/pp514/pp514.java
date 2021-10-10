package jaf.kapitel5.pp514;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class pp514 {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Character> list = new ArrayList<>();
        /*ArrayList<Integer> places = new ArrayList<>();*/
        String textNumber = null;
        Scanner fileScan;
        int number = 0;

        //make a scanner which scans the whole file
        fileScan = new Scanner(new File("src/jaf/kapitel5/pp514/number"));

        //scan as long as the file scanner has chars to scan
        while(fileScan.hasNext())
        {
            textNumber = fileScan.nextLine();
            for( int i = 0; i <= textNumber.length()-1; i++){
                //calculate if the char is an integer (with the ascii code)
                if (textNumber.charAt(i) > 47 && textNumber.charAt(i) < 58){
                    list.add(textNumber.charAt(i));
                    /*real.add(i);*/
                }
            }
            System.out.println( textNumber);


        }


        System.out.println(list);
        System.out.println();






        /* Here I tried to take the numbers as they are, but I couldn't make it
        System.out.println(places);
        for (int n = 0; n < places.size()-1; n++){
            if (places.get(n)+1 == places.get(n+1)){
                number = number * 10 + list.get(n);
                System.out.println(number);
            }
            else
                number = 0;

        }

        */



    }
}
