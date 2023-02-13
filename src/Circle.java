public class Circle {
    private static final  double PI= 3.1415;
    public Circle(){
    }
    static double area(double radus ){
        return PI*(radus*radus);

    }
    static double circumference(double radius){
        return PI *2*radius;
    }

    @Override
    public String toString() {
        return " Circle";
    }
}
