import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhotoAlbum extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    private ImagePanel imagePanel;



    public  PhotoAlbum(){

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        imagePanel=new ImagePanel("photos/1.jpg");

        ActionListener actionListener = new BtnActionListener();

        btn1= new JButton("photo № 1");
        btn1.setActionCommand("photos/1.jpg");
        btn1.addActionListener(actionListener);

        btn2= new JButton("photo № 2");
        btn2.setActionCommand("photos/2.jpg");
        btn2.addActionListener(actionListener);

        btn3= new JButton("photo № 3");
        btn3.setActionCommand("photos/3.jpg");
        btn3.addActionListener(actionListener);

        btn4= new JButton("photo № 4");
        btn4.setActionCommand("photos/4.jpg");
        btn4.addActionListener(actionListener);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(imagePanel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btn1)
                        .addComponent(btn2)
                        .addComponent(btn3)
                        .addComponent(btn4)
                ));

        layout.linkSize(SwingConstants.HORIZONTAL, btn1, btn2,btn3,btn4);

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(imagePanel)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addComponent(btn2)
                        .addComponent(btn3)
                        .addComponent(btn4)
                )));
    }


    public class BtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            imagePanel.changePicture(e.getActionCommand());
        }
    }

}