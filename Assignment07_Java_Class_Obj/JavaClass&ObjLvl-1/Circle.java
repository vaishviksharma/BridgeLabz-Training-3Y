class Circle{
    double radius;

    Circle(double radius){
        this.radius= radius;
    }

    public double Area(){
        return Math.PI * radius * radius;
    }

    public double Circumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args){
        Circle circle= new Circle(5);
        System.out.println("Area of the circle: " + circle.Area());
        System.out.println("Circumference of the circle: " + circle.Circumference());
    }
}