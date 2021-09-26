package jaf.kapitel4.pp44;

// *************************************************************************************
//  kapitel4.PP42.java           Author:Devin/Hasler
//  creat the class Dog to make it possible to creat dogs with name and age
// *************************************************************************************

public class Dog {
    private String name;                    //instantiate the variables name and age
    private int age;                        //private because we only need them in this class

    public Dog() {
        this.name = "";
        this.age = 0;
    }

    public void setName(String name) {                   //creat set and get Methods for Name and Age
        this.name = name;                               //set for creating/ get for printing(in this case)
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int compute(int age) {               //compute the age to human age scala
        return age * 7;
    }

    public String toString() {                  //creat a toString method to return a one-line description
        return "name: " + name + "\t" + " age: " + getAge() + " years old " + "\t" + " age computed: " + compute(getAge()) + " years old";
    }
}
