package jaf.kapitel5.ex514;

public class evenlyDivisible {

    int number1;                //instantiate two variables number1 and number2
    int number2;


    public evenlyDivisible(int number1, int number2) {          //creat a constructor method
        this.number1 = number1;
        this.number2 = number2;
    }

    public boolean isDivisible() {              //creat a boolean method for checking the divisibility
        int division1 = number1 / number2;
        int division2 = number2 / number1;

        return division1 * number2 == number1 || division2 * number1 == number2;
    }

}
