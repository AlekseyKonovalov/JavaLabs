import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Point{

    public double x;
    public double y;

    public Point(){
        x=0;
        y=0;
    }

    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }

    public void changePoints(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distanceBetweenPoints(){

        double result=sqrt(x*x+y*y);
        return result;
    }

    public double distanceBetweenPoints(double x2, double y2){

        double result=sqrt(pow((x-x2),2)+pow((y-y2),2));
        return result;
    }

    public String pointToString(){
        String strPoint="(" + Double.toString(x) + ";"+ Double.toString(y) + ")";
        return  strPoint;
    }

    public boolean comparePoints (double x2 , double y2){
        if  (( x==x2) && (y==y2) )
            return true;
        else return false;
    }

}