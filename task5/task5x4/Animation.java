package task5x4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

class Animation extends JFrame {
    String path = "C:/Users/Dmitry/Downloads/bloggif_frames_gif";
    int width = 600;
    int height = 400;

    Animation() {
        super("Animation");
        setSize(width, height);
        setLocation(300, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Button button1 = new Button("Start");
        button1.setSize(50, 50);
        button1.setLocation(0, 315);
        button1.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                        setSize(width + 1, height);
                        setSize(width - 1, height);
                    }
                });
        add(button1);
    }

    public void paint(Graphics g) {
        File dir = new File(path);
        for (File file : dir.listFiles()) {
            Image img = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(img, 0, 0, width, height, this);
            try {
                Thread.sleep(150);
            }
            catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}