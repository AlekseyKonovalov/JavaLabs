import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImagePanel extends JPanel{

    private String imgFile;
    private Image img;


    public ImagePanel(String imgFile){
       this.imgFile=imgFile;
    }


    public void changePicture(String imgFile){
        this.imgFile=imgFile;

        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        try
        {
            File sourceimage = new File(imgFile);
            img = ImageIO.read(sourceimage);
            g.drawImage(img, 0, 0, null);
        }
        catch(IOException ex)
        {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE,null, ex);

        }
    }
}

