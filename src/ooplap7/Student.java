package ooplap7;
//design
// id;
// name;
// major;
// group;

public class Student {
    private String id;
    private String name;
    private String major;
    private String group;



    //contructor
    //defalt
    public Student(){}
    public Student(String id, String n, String m, String g) {
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;

    } //contructor
    //getter and setter method
    //id
    public void setId(String id) {
        this.id = id;
    }//set id

    public String getId() {
        return this.id;
    }//getId

    public void setName(String name) {
        this.name = name;
    }//set name

    public String getName() {
        return this.name;
    }//getname

    public void setMajor(String major) {
        this.major = major;
    }//set major

    public String getMajor() {
        return this.major;
    }//getmajor

    public void setGroup(String group) {
        this.group = group;
    }//setgroup

    public String getGroup() {
        return this.group;
    }//getgroup



}//class