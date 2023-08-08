SUPER CLASS-ANIMAL:

public class Animal {
    protected String type;
    private String size;
    protected double weight;

    public Animal(){
       this("No type","No size","Not defined");

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
    public void move(String speed){
        System.out.println(type + " runs "+ speed);
    }
    public void makeNoice(){
        System.out.println(type + " makes some kind of noice");
    }
}
SUB CLASS-DOG:

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog(){
        super("Lab","Small",45);
    }
    public Dog(String type,double weight){
        this(type,weight,"round","Curved");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, (weight<15?"Small":(weight<35?"Medium":"Large")), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoice() {
        if(type=="Oora kukka"){
            System.out.println("bow bow bow bow");
        }
        bark();
//        System.out.println();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs wag their tail while walking");
        if (speed=="slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
    }
    private void bark(){
        System.out.println("Woof..!!");
    }
    private void run(){
        System.out.println("Running..!!");
    }
    private void walk(){
        System.out.println("Walking..!!");
    }
    private void wagTail(){
        System.out.println("wagging tail..!!");
    }

}
SUB CLASS-FISH:
public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(){
        super();
    }

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "Small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    public void makeNoice() {
        if(weight<15){
            moveBackFins();
        }
        else{
            moveMuscles();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
    private void moveMuscles(){
        System.out.println("Fish moves muscles while swimming");
    }
    private void moveBackFins(){
        System.out.println("Fish moves back fins while sleeping");
    }
}
MAIN CLASS:
public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Generic Animal","Huge",567);
        doAnimal(animal,"Fast");
        Dog d= new Dog();
        doAnimal(d,"Fast");
        Dog f= new Dog("German Shepaerd",400.5);
        doAnimal(f,"Very Fast");
        Dog t=new Dog("Oora kukka",13,"Sannaga","podavuga");
        doAnimal(t,"slow");
        Fish i= new Fish("pulasa",78,4,8);
        doAnimal(i,"slow");
        Fish p= new Fish("Gold Fish",78,8,9);
        doAnimal(p,"Fast");
    }
    public static void doAnimal(Animal animal, String speed){
        animal.makeNoice();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}
OUTPUT:

Generic Animal makes some kind of noice
Generic Animal runs Fast
Animal{type='Generic Animal', size='Huge', weight='567.0'}
______
Woof..!!
Lab runs Fast
Running..!!
Woof..!!
Dog{earShape='null', tailShape='null'} Animal{type='Lab', size='Small', weight='45.0'}
______
Woof..!!
German Shepaerd runs Very Fast
Running..!!
Woof..!!
Dog{earShape='round', tailShape='Curved'} Animal{type='German Shepaerd', size='Large', weight='400.5'}
______
bow bow bow bow
Woof..!!
Oora kukka runs slow
Walking..!!
wagging tail..!!
Dog{earShape='Sannaga', tailShape='podavuga'} Animal{type='Oora kukka', size='Small', weight='13.0'}
______
Fish moves muscles while swimming
pulasa runs slow
Fish{fins=4, gills=8} Animal{type='pulasa', size='Small', weight='78.0'}
______
Fish moves muscles while swimming
Gold Fish runs Fast
Fish{fins=8, gills=9} Animal{type='Gold Fish', size='Small', weight='78.0'}
______


