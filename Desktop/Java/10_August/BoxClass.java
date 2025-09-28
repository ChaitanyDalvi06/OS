
class Box{
    double w,h,d;
    Box(double w,double h,double d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }
    Box()
    {
        w=h=d=0;
    }
    Box(double a)
    {
        w=h=d=a;  
    }
    Box (Box ob)
    {
        w=ob.w;
        h=ob.h;
        d=ob.d;
    }
    double volume()
    {
        return w*h*d;
    }

}


public class BoxClass {
    public static void main(String[] args) {
        Box myBox1=new Box();
        Box myBox2=new Box(5);
        Box myBox3=new Box(5,10,15);
        Box myBox4=new Box(myBox3);
        Box myBox5=myBox3;

        System.out.println("myBox1:" +myBox1.volume());
        System.out.println("myBox2:" +myBox2.volume());
        System.out.println("myBox3:" +myBox3.volume());
        System.out.println("myBox4:" +myBox4.volume());
        System.out.println("myBox5:" +myBox5.volume());
    }
    
    
}
