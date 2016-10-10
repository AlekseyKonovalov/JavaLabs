import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Interface extends JFrame{

    private JButton btn1 = new JButton("Посчитать количество слов в файле");
    private JTextField text1=  new JTextField();
    private JTextField text2 = new JTextField();

    public Interface(){
        super("Count words in file");
        setBounds(100, 100, 200, 200);

        Container container= new Container();
        container.setLayout(new GridLayout(3,1,1,1));
        container.add(text1);
        container.add(btn1);
        container.add(text2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //btn1.addActionListener(new Button);

    }


}
/*
class ButtonEventListener implements ActionListener{
    public  void actionPerformed()
}*/
