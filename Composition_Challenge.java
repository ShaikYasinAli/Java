This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods.
The five classes should be created as follows:
1) Create a class and name it Lamp. Inside this class should be declared three member variables: style of type String, battery of type boolean, and globRating of     
type int. All variables should be marked private. A constructor needs to be created which accepts the three member variables as parameters.
In addition, four methods should also be created: turnOn() has no return type and should 
print a message that the lamp is being turned on; getStyle() returns the lamp style; isBattery returns the value of battery; and getGlobRating() returns the globRating of the lamp.
2) Create a class and name it Bed. Five private member variables should be declared: style of type String, and pillows, height, sheets, quilt of type int. A constructor s
hould be coded which accepts these five member variables as parameters. Also, six methods should be defined: 
make() has no return type and prints a message to the effect that the bed is being made; getStyle() which returns the value of style; 
getPillows() returns the number of pillows; 
getHeight() returns the height of the bed; getSheets() returns the number of sheets on the bed; and getQuilt() returns the value of quilt.
3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor, both of type int. There should also be a constructor 
which accepts both member variables as parameters. There are also two additional methods which should be defined: 
getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.
4) Create a class with the name Wall. It contains one member variable, direction, and is of type String. A constructor for Wall should accept one parameter for the member variable direction.
A getter should also be defined for the direction field called getDirection().
5) Create a class with the name Bedroom. This class contains eight member variables:
name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp. The class constructor should accept all eight of the member variables as parameters, 
and there should also be two additional methods:
getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.

BedRoom Class:

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lampa;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return lamp;
    }
    public void makeBed(){
        bed.make();
    }
}

Wall Class:
  
public class Wall {
    private String direction;
    public Wall(String direction){
        this.direction=direction;
    }
    public String getDirection(){
        return direction;
    }

}

Ceiling Class:
public class Ceiling {
    private int height;
    private int paintedColor;
    
    public Ceiling(int height, int paintedColor){
        this.height=height;
        this.paintedColor=paintedColor;
        
    }
    public int getHeight(){
        return height;
    }
    public int getPaintedColor(){
        return paintedColor;
    }
}

Bed Class:
  
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows,int height,int sheets,int quilt){
        this.style=style;
        this.pillows=pillows;
        this.height=height;
        this.sheets=sheets;
        this.quilt=quilt;
    }
    public void make(){
        System.out.print("Bedroom -> Making bed | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

Lamp Class:
  
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;
    public Lamp(String style,boolean battery,int globRating){
        this.style=style;
        this.battery=battery;
        this.globRating=globRating;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle(){
        return style;
    }
    public boolean isBattery(){
        return battery;
    }
    public int getGlobRating(){
        return globRating;
    }

}

Main Class:
  
public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();


    }
}

Output:
Bedroom -> Making bed | Lamp -> Turning on
