class Calculate
{
    Calculate(int a, int b)
    {
        System.out.println("Area of rectangle is : "+(a*b));
    }
    Calculate(int a)
    {
        System.out.println("Area of square is : "+(a*a));
    }
    Calculate(double a)
    {
        System.out.println("Area of Circle is : "+(3.14*a*a));
    }
}

public class Geometry 
{
    public static void main(String[] args) {
        Calculate rectangle = new Calculate(5, 6);
        Calculate square = new Calculate(5);
        Calculate circle = new Calculate(7);
    }   
}
