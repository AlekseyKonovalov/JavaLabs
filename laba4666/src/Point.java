import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;

import java.math.*;

public class Point {

    private double x;
    private double y;

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void movePoint(double x, double y) {
         this.x = x;
         this.y = y;
    }

    public double calculationDistanceToCenter(){
          return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double calculationDistanceToOtherPoint(double otherX, double otherY){
        return Math.abs(Math.sqrt(Math.pow(x-otherX,2)+ Math.pow(y-otherY,2)));
    }

    public String toStringCoordinates(){
        return "("+x+";"+y+")";
    }

    public boolean comparePoints(double otherX, double otherY){
        if (x == otherX && y == otherY) return true;
        else return false;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

}
