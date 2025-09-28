public class Circle {
    
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
   
    public double getRadius() {
        return this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }
    public static void main(String[] args) {
        
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(2.5);

        System.out.println("Default Circle:");
        System.out.println("Radius: " + defaultCircle.getRadius());
        System.out.println("Area: " + defaultCircle.calculateArea());
        System.out.println("Circumference: " + defaultCircle.calculateCircumference());

        System.out.println("\nCustom Circle:");
        System.out.println("Radius: " + customCircle.getRadius());
        System.out.println("Area: " + customCircle.calculateArea());
        System.out.println("Circumference: " + customCircle.calculateCircumference());
    }
}

