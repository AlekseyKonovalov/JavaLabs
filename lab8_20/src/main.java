import javax.swing.*;
import java.awt.*;


public class main {
    public static void main(String args[]) {
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        photoAlbum.setTitle("My Photo Album");
        photoAlbum.setVisible(true);
        photoAlbum.setSize(800, 700);
        photoAlbum.pack();
    }
}
