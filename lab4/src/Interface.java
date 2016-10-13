import java.util.Scanner;

public class Interface{

    private Line brokenLine;
    private Scanner scan = new Scanner(System.in);

    private void specifySizeLine(){
        int temp;
        System.out.println("Укажите количество точек :");
        temp =  scan.nextInt();
       brokenLine.resizeLine(temp);
    }

    private Point inputPoint(){
        Point tempPoint=new Point();
        System.out.println("Укажите координату X :");
        double tmpCoordinat=scan.nextInt();
        tempPoint.x=tmpCoordinat;
        System.out.println("Укажите координату Y :");
        tmpCoordinat=scan.nextInt();
        tempPoint.y=tmpCoordinat;
        return tempPoint;
    }

    private void addPoints(){
        brokenLine.addPoint(inputPoint());
    }

    private void outLinePoints(){
        System.out.println (brokenLine.stringLine());
    }

    private  void outLineSum(){
        System.out.println("Длина всех звеньев равна " + Double.toString(brokenLine.pointsLenght()));
    }

    private  void outLinePoint(){
        Point tempPoint = inputPoint();

        if (brokenLine.searchPoint(tempPoint)==-1){
            System.out.println("Точки с такими координатами не найдено");
        }
        else {
            Point temp2=new Point();
            temp2=brokenLine.getPoint(brokenLine.searchPoint(tempPoint));
            System.out.println("X : " + Double.toString(temp2.x) + "Y : " + Double.toString(temp2.y));
        }
    }

    private void choiseSizeArray(){
        brokenLine=new Line();
        System.out.println("Указать начальное количество точек ломаной линии?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int choise = scan.nextInt();

       while ((choise != 1) && (choise!=2)){
           System.out.println("Ошибка ввода, Попробуйте еще");
           choise = scan.nextInt();
        }
        if(choise==1){
            specifySizeLine();
            System.out.println("Все ок");
        }
    }

    private void newBrokenLine(){
        brokenLine=new Line();
        choiseSizeArray();
        addPoints();
    }

    public void outInterface() {
        int choise = -1;
        choiseSizeArray();

        while (choise != 0) {
            System.out.println("1 - Ввести значения координат");
            System.out.println("2 - Вывод информации о линии в виде строки");
            System.out.println("3 - Вывод суммарной длины всех звеньев");
            System.out.println("4 - Вывод вершины, координаты которых совпадают с координатами заданной точки");
            System.out.println("5 - Задать координаты точек новой ломаной линии");
            System.out.println("0 - Выход");

            choise = scan.nextInt();

            switch (choise) {
                case 1: {
                    addPoints();
                    break;
                }
                case 2: {
                    outLinePoints();
                    break;
                }
                case 3: {
                    outLineSum();
                    break;
                }
                case 4: {
                    outLinePoint();
                    break;
                }
                case 5: {
                    newBrokenLine();
                    break;
                }

            }
        }
    }
}
