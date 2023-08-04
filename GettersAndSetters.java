public class Car {
Scanner sc= new Scanner(System.in);

    private String Name="Hyundai";
    private int Doors=5;
    private String Colour="Blue";
    private String Model="SUV-100";
    private boolean Convertable=true;
    public String getName() {
        return Name;
    }
    public int getDoors() {
        return Doors;
    }
    public String getColour() {

        return Colour;
    }
    public String getModel() {
        return Model;
    }
    public boolean isConvertable() {
        return Convertable;
    }
  public void setName(String name) {
        Name = name;
    }
    public void setDoors(int doors) {
        Doors = doors;
    }
    public void setColour(String colour) {
        Colour = colour;
    }
    public void setModel(String model) {
        Model = model;
    }
    public void setConvertable(boolean convertable) {
        Convertable = convertable;
    }
    public void descCar(){
        System.out.println(Name +" Car has "+ Doors +" Doors and it is of "+Colour+" colour of model "+Model+" and it is "+(Convertable?"Convertable":"Not Convortable"));
    }
}
