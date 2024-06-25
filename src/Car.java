public class Car {

    private String name;
    private String model;
    private String color;
    private int doors;

    public Car(String name, String model, String color, int doors) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    // default values
    public Car(String name, int doors) {
        this(name, "2024", "Black", doors);
    }



    public void move() {
        System.out.println(this.name + " is moving Wroommmmmm...............");
    }

    public void stop() {
        System.out.println(this.name + " has stopped Screech.........");
    }

    public void getCarDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("No of doors: " + this.doors);
    }


}