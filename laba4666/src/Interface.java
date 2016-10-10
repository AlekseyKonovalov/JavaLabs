import java.io.IOException;

public class Interface {

    private BrokenLine line;

    private int setNumberPoints() throws Exception{
        System.out.println("Указать количество точек? 1 - да, 2 - нет");

        if (System.in.read() == 1){
            System.out.print("Введите кол-во точек: ");
            return System.in.read();
        }
        else return 0;

    }

    private void inputCoordinatesPoints()throws Exception{
        int x,y;

        while(true){
            Runtime.getRuntime().exec("cls");

            System.out.println("Добавить новую точку? 1 - да, 2 - нет");

            if(System.in.read()==1){
            System.out.print("Введите координату X: ");
            x = System.in.read();
            System.out.print("Введите координату Y: ");
            y = System.in.read();

            line.addPoint(new Point(x,y));
            }
            else break;
        }
    }



    private void ouputVertexsMatchPoint()throws Exception{
        Runtime.getRuntime().exec("cls");

        int x,y;

        System.out.print("Введите координату X: ");
        x = System.in.read();
        System.out.print("Введите координату Y: ");
        y = System.in.read();

        line.searchVertexs(new Point(x,y));
    }

    public Interface() throws Exception {

        int sizeArray = setNumberPoints();

        if (sizeArray == 0) line = new BrokenLine();
        else line = new BrokenLine(sizeArray);

        inputCoordinatesPoints();

        System.out.println(line.toStringCoordinatesPoints());

        int key = -1;

        while(key != 0){

            System.out.print("1 - Указать количество точек линии");
            System.out.print("2 - Ввести значения координат");
            System.out.print("3 - Вывод информации о линии в виде строки");
            System.out.print("4 - Вывод суммарной длины всех звеньев");
            System.out.print("5 - Вывод вершин, координаты которых совпадают с координатами заданной точки");
            System.out.print("6 - Создать новую линию");
            System.out.print("0 - Выход");

            key = System.in.read();

            switch (key){
                case 1:{

                   break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                case 4:{

                }
                    break;
                case 5:{

                    break;
            }
        }

    }
}
