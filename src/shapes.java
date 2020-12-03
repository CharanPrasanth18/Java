public class shapes {
    int length,breadth,radius;
    shapes(int length,int breadth,int radius){
        this.length=length;
        this.breadth=breadth;
        this.radius=radius;
    }
}
class circle extends shapes{
    circle(int length,int breadth,int radius){
        super(length,breadth,radius);
        System.out.println("Circle with radius= "+radius);
    }
}
class square extends shapes{
    square(int length,int breadth,int radius){
        super(length,breadth,radius);
        System.out.println("Square with side length "+length);
    }
}
class rectangle extends shapes{
    rectangle(int length,int breadth,int radius){
        super(length,breadth,radius);
        System.out.println("Rectangle with length "+length+" and breadth "+breadth);
    }
}
class Shape{
    public static void main(String[] args){
        System.out.println("CIRCLE");
        circle c = new circle(0,0,50);
        System.out.println("SQUARE");
        square s = new square(5,0,0);
        System.out.println("RECTANGLE");
        rectangle r = new rectangle(6,4,0);

    }
}
