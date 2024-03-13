public class Area_of_Circle  {

    static Area_of_Circle Area_Of_Circle = new Area_of_Circle();
    static double r = 10; // double as it can be any number
    final static double pi = 3.14;
    static double ans ;

    //Instance method with parameters
    void area (double r){   //pi has fixed value so not considered in parameter. Radius with parameter. Instance Method
        ans = (r * r) * pi;

        System.out.println(ans);
    }

    public static void main (String []args){
        Area_Of_Circle.area(10); //with integer number
        Area_Of_Circle.area(20.05); // with decimal number satisfying the double r criteria

    }
}
