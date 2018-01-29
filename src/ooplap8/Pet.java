package ooplap8;

public class Pet {
    private String name;
    private String hairColor;
    private String gender;
    private int age;

    public void makeNoise(){}

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    // constructor                                  กด ALT+Insert
    public Pet(String name, String hairColor, String gender, int age) {
        // assign data to object properties
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
        this.age = age;
    }

    // getter and setter method                     กด ALT+Insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}