
public class BrokenLine {

    private Point[] points;
    private int numberPoints = 0;

    public void addPoint(Point newPoint){
        if(numberPoints+1 == points.length) increaseArray();

        points[numberPoints] = newPoint;
        numberPoints++;
    }

    public Point getPoint(int index){
        return points[index];
    }

    private void increaseArray(){
        Point[] array = new Point[points.length*2];

        System.arraycopy(points, 0, array, 0, points.length);

        points = array;
    }

    public double calculationDistanceElementBrokenLine(){
        double lenghtLine=0;

        for (int i=0; i < points.length-1; i++){
             lenghtLine += points[i].calculationDistanceToOtherPoint(points[i+1].getX(),points[i+1].getY());
        }
        return lenghtLine;
    }

     public void searchVertexs(Point point){
         for(Point temp : points){
             if(point.comparePoints(temp.getX(),temp.getY())) System.out.println(temp.toStringCoordinates());
         }
     }

    public String toStringCoordinatesPoints(){
        String listCoordinates = "";
        for(Point temp : points){
            listCoordinates += temp.toStringCoordinates() + " - ";
        }
        return listCoordinates;
    }

    public BrokenLine(){
        this(10);
    }

    public BrokenLine(int sizeArray){
        points = new Point[sizeArray];
    }
}
