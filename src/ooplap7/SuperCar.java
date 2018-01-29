package ooplab7;

public class SuperCar {

    public void getSuperCarInfo(SuperCar c) {
        System.out.println("Super Car info ");
        System.out.println("Car Brand : "+c.getBrand());
        System.out.println("Car Color : "+c.getColor());
        System.out.println("Car Engine Size : "+c.getEnginesize());
        System.out.println("Max Speed : "+c.getMaxspeed());
        System.out.println("Country : "+c.getCountry());
    }

    private String brand;
    private String color;
    private String enginesize;
    private String maxspeed;
    private String country;

    // constructor
    public SuperCar(){}
    public SuperCar(String b,String c,String s,String m,String cr){
        this.brand = b;
        this.color = c;
        this.enginesize = s;
        this.maxspeed = m;
        this.country = cr;
    } // constructor

    // getter and setter methods
    // car brand
    public void setBrand(String brand) {
        this.brand = brand; }

    public String getBrand() {
        return this.brand; }

    // car color
    public void setColor(String color) {
        this.color = color; }

    public String getColor() {
        return this.color; }

    // car engine size
    public void setEnginesize(String enginesize) {
        this.enginesize = enginesize; }

    public String getEnginesize() {
        return this.enginesize; }

    // max speed
    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed; }

    public String getMaxspeed() {
        return this.maxspeed; }

    // country of origin
    public void setCountry(String country) {
        this.country = country; }

    public String getCountry() {
        return this.country; }


} // class} // class