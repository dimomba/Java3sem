package task5x3;

import java.awt.*;
import javax.swing.*;

class Picture extends JFrame {
    String path = "C:/Users/Dmitry/Downloads/cayman2.jpg";
    int width = 850, height = 500;

    Picture() {
        super("Picture");
        setSize(width, height);
        setLayout(null);
        setLocation(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Image img = Toolkit.getDefaultToolkit().getImage(path);
        g.drawImage(img, 0, 0, width, height, this);
    }

    public static void main(String[] args) {
        Picture app = new Picture();
    }
}