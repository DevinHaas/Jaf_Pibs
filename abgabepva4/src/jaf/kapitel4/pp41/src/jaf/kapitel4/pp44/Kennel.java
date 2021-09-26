package jaf.kapitel4.pp41.src.jaf.kapitel4.pp44;

// *************************************************************************************
//  kapitel4.PP42.java           Author:Devin/Hasler
//  Use the Class Dog to make it possible to creat dogs with name and age
// *************************************************************************************

public class Kennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog();                       //creat to dogs for applying the methods in the Dog Class
        Dog dog2 = new Dog();
        dog2.setName("Bora");                       //name two dogs
        dog1.setName("Kennel");
        System.out.println(dog1.getName());             //print the names
        System.out.println(dog2.getName());
        dog1.setAge(3);
        dog2.setAge(6);
        System.out.println(dog1.getAge());
        System.out.println(dog2.getAge());
        System.out.println(dog2.compute(dog2.getAge()));
        System.out.println(dog1.compute(dog1.getAge()));
        System.out.println(dog1);
        System.out.println(dog2);
    }

}
