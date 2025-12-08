abstract class Shape {
    
    public abstract double calculateArea();
}

class Circle extends Shape{
        public double r;
        Circle(double r){
            this.r=r;
        }
        public double calculateArea(){
            return 3.14*r*r;
        }

}

class Rectangle extends Shape{
    public double length;
    public double width;

    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    public double calculateArea(){
        return length*width;
    }
}

class Main{
    public static void main(String[] args) {
        Circle c=new Circle(2);
        Rectangle r=new Rectangle(5, 3);

        System.out.println("The area of circle is "+c.calculateArea());
        System.out.println("The area of rectangle is "+r.calculateArea());
        
    }
}