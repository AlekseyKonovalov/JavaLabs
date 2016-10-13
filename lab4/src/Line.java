import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Line{
    ArrayList<Point> points;

    public Line(){
        points=new ArrayList<Point>();
    }

    public void resizeLine(int size){
        points=new ArrayList(size);
    }

    public  void addPoint(Point newPoint){
        points.add(newPoint);
    }

    public Point getPoint (int index){
        return points.get(index);
    }

    public double pointsLenght(){
        double lenght = 0;
        Point temp=new Point();
        Point temp2=new Point();

        for (int i=1; i<points.size(); i++)
        {
            temp=points.get(i-1);
            temp2=points.get(i);
            lenght+=sqrt(pow((temp.x-temp2.x),2)+pow((temp.y-temp2.y),2));
        }
        return lenght;
    }

    public int searchPoint(Point p1) { // вернет индекс искомой точки
        Point temp = new Point();
        for (int i = 0; i < points.size(); i++) {
            temp = points.get(i);

            if (p1.equals(temp)) {
                return i;
            }
        }
        return -1;
    }

    public String stringLine(){
        Point temp = new Point();
        String strLine="";
        for (int i = 0; i < points.size(); i++) {
            temp = points.get(i);
            strLine+= temp.pointToString();
        }
        return  strLine;
    }
}