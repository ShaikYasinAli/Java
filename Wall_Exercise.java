Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
Method named getWidth without any parameters, it needs to return the value of width field.
Method named getHeight without any parameters, it needs to return the value of height field.
Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
Method named getArea without any parameters, it needs to return the area of the wall.
TEST EXAMPLE

→ TEST CODE:
Wall wall = new Wall(5,4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
→ OUTPUT:
area= 20.0
width= 5.0
height= 0.0
area= 0.0
Code:
public class Wall {
    private double width;
    private double height;
    public Wall(){

    }
    public Wall(double w, double h){
        if(w<0){
            width=0;
        }
        else{
            width=w;
        }
        if(h<0){
            height=0;
        }
        else{
            height=h;
        }

    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double w){
        if (w<0){
            width=0;
        }
        else{
            width=w;
        }
    }
    public void setHeight(double h){
        if (h<0){
            height=0;
        }
        else{
            height=h;
        }
    }
    public double getArea(){
        return (height*width);
    }
}
