package ooplap8;

public class Cat extends Pet{
    public Cat(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age);

    } // constructor

    @Override
    public void makeNoise() {
        System.out.println("Meaw Meaw !!!");
    }
}