package ooplap8;

public class Dog extends Pet {
    // extends คือ คำสั่งที่บอกสืบทอดมาจาก class ไหน
    public Dog(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age);
        // Pet คือ super-class
        // Dog คือ sub-class


    } // constructor

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}